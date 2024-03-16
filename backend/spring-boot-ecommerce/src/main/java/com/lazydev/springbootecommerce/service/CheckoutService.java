package com.lazydev.springbootecommerce.service;

import com.lazydev.springbootecommerce.dto.PaymentInfo;
import com.lazydev.springbootecommerce.dto.Purchase;
import com.lazydev.springbootecommerce.dto.PurchaseResponse;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);

    PaymentIntent createPaymentIntent(PaymentInfo paymentInfo) throws StripeException;
}
