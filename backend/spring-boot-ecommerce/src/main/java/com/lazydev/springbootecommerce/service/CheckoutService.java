package com.lazydev.springbootecommerce.service;

import com.lazydev.springbootecommerce.dto.Purchase;
import com.lazydev.springbootecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
