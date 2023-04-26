package com.moringa.productshoppingcatservice.controllers;

import com.moringa.productshoppingcatservice.models.Cart;
import com.moringa.productshoppingcatservice.models.CartItem;
import com.moringa.productshoppingcatservice.models.PaymentDetails;
import com.moringa.productshoppingcatservice.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;

@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    RestTemplate restTemplate;

    @Value("${shopping-payment-service-url}")
    String paymentServiceUrl;

    @Value("${shopping-product-catalog-service-url}")
    String productCatalogService;

    @RequestMapping("/{userId}")
    public Cart getCartByUserId(@PathVariable String userId) {

        CartItem cartItem = new CartItem("00P", 2,
                restTemplate.getForObject( productCatalogService + "/product/" + "001P", Product.class).getPrice());
        ArrayList<CartItem> cartItems = new ArrayList<>();
        cartItems.add(cartItem);
        return new Cart(cartItems, restTemplate.getForObject(paymentServiceUrl + "/payment/" + userId, PaymentDetails.class));
    }
}
