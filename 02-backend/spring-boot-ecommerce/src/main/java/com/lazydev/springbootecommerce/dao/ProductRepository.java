package com.lazydev.springbootecommerce.dao;

import com.lazydev.springbootecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200") //Origin is protocol + hostname + port
public interface ProductRepository extends JpaRepository<Product, Long> {
}
