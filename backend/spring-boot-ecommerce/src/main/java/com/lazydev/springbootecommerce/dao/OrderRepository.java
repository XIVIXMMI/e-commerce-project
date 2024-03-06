package com.lazydev.springbootecommerce.dao;

import com.lazydev.springbootecommerce.entity.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface OrderRepository extends JpaRepository<Order,Long> {

    Page<Order> findByCustomerEmail(@Param("email") String email, Pageable pageable);
    /**
     * SELECT * FROM orders
     * LEFT OUTER JOIN customer
     * ON orders.customer_id=customer.id
     * WHERE customer.email=:email
     * http://localhost:8080/api/orders/search/findByCustomerEmail?email=dev.test@gmail.com
     * */
}
