package com.moringa.productpaymentservice.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PaymentDetails {
    private String usersName;
    private String address;
    private String cardNo;
    private String userId;
}
