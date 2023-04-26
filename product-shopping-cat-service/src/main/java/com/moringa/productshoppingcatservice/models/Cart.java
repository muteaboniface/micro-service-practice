package com.moringa.productshoppingcatservice.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Cart {
    private ArrayList<CartItem> cartItems;
    private PaymentDetails paymentDetails;
}
