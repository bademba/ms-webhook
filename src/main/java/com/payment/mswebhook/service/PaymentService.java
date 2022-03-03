package com.payment.mswebhook.service;

import com.payment.mswebhook.entity.PaymentWebhookEntity;
import com.payment.mswebhook.repository.PaymentRepository;
 import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentWebhookRepository;


    public List<PaymentWebhookEntity> getAllPaymentWebhooks(){
        return paymentWebhookRepository.findAll();
    }

    public PaymentWebhookEntity savePaymentWebhook(PaymentWebhookEntity paymentWebhookEntity){
        return  paymentWebhookRepository.save(paymentWebhookEntity);
    }
}
