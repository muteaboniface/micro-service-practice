package com.moringa.productpaymentservice.controllers;
import com.moringa.productpaymentservice.models.PaymentDetails;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @RequestMapping("/{userId}")
    public PaymentDetails getUserPaymentDetails(@PathVariable String userId) {
        return new PaymentDetails("John Doe", "XXX Limuru Road", " 764748 XXXX 75859", userId);
    }
}
