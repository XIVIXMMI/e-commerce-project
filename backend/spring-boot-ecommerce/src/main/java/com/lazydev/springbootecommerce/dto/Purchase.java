package com.lazydev.springbootecommerce.dto;

import com.lazydev.springbootecommerce.entity.Address;
import com.lazydev.springbootecommerce.entity.Customer;
import com.lazydev.springbootecommerce.entity.Order;
import com.lazydev.springbootecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}
