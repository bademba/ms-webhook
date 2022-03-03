package com.payment.mswebhook.controller;

import com.payment.mswebhook.entity.PaymentWebhookEntity;
 import com.payment.mswebhook.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    private PaymentService paymentService;

    @GetMapping("/payments/v1/webhook")
    public List<PaymentWebhookEntity> getPaymentWehooks(){
        return paymentService.getAllPaymentWebhooks();
    }

    @PostMapping("/payments/v1/webhook")
    public PaymentWebhookEntity savePaymentWebhooks(@RequestBody PaymentWebhookEntity paymentWebhookEntity){
        return paymentService.savePaymentWebhook(paymentWebhookEntity);
    }
}
