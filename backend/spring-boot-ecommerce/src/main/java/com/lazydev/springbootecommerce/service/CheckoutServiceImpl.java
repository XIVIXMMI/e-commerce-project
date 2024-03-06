package com.lazydev.springbootecommerce.service;

import com.lazydev.springbootecommerce.dao.CustomerRepository;
import com.lazydev.springbootecommerce.dto.Purchase;
import com.lazydev.springbootecommerce.dto.PurchaseResponse;
import com.lazydev.springbootecommerce.entity.Customer;
import com.lazydev.springbootecommerce.entity.Order;
import com.lazydev.springbootecommerce.entity.OrderItem;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.UUID;

@Service
public class CheckoutServiceImpl implements CheckoutService{

    private CustomerRepository customerRepository;

    //@Autowired // is optional since we only have one constructor
    public CheckoutServiceImpl(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }
    @Override
    @Transactional
    public PurchaseResponse placeOrder(Purchase purchase) {

        //retrieve the order info from dto
        Order order = purchase.getOrder();

        //generate tracking number
        String orderTrackingNumber = generateOrderTrackingNumber();
        order.setOrderTrackingNumber(orderTrackingNumber);

        //populate order with orderItems
        Set<OrderItem> orderItems = purchase.getOrderItems();
        orderItems.forEach(item -> order.add(item));

        //populate order with shippingAddress and billingAddress
        order.setBillingAddress(purchase.getBillingAddress());
        order.setShippingAddress(purchase.getShippingAddress());


        //populate customer with order
        Customer customer = purchase.getCustomer();


        //check if this is an existing customer
        String theEmail = customer.getEmail();

        Customer customerFromDB = customerRepository.findByEmail(theEmail);

        if(customerFromDB != null) {
            // found customer
            customer = customerFromDB;
        }

        customer.add(order);

        //save to database
        customerRepository.save(customer);

        //return a response
        return new PurchaseResponse(orderTrackingNumber);

    }

    private String generateOrderTrackingNumber() {

        //generate a random UUID number (UUID version-4)
        return UUID.randomUUID().toString();
    }
}
