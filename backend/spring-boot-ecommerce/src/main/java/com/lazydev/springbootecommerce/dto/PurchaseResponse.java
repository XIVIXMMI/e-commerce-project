package com.lazydev.springbootecommerce.dto;


//Use this class to send back a Java object as JSON

import lombok.Data;

@Data
public class PurchaseResponse {

    /*
    * Lombok @Data will generate constructor for final fields
    * Another option is using @NonNull annotation on the field instead of final
    * @NonNull private String orderTrackingNumber
    * */
    private final String orderTrackingNumber;

}
