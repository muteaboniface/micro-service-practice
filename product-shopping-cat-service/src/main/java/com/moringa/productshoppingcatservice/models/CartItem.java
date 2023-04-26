package com.moringa.productshoppingcatservice.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CartItem {
    private String productId;
    private int quantity;
    private Double pricePerItem;


}
