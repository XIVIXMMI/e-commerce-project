package com.lazydev.springbootecommerce.dao;

import com.lazydev.springbootecommerce.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Customer findByEmail(String theEmail);
    // SELECT * FROM Customer c WHERE c.email = theEmail
    // return null if not found
}
