package com.payment.mswebhook.repository;

import com.payment.mswebhook.entity.PaymentWebhookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<PaymentWebhookEntity,Integer>{

}
