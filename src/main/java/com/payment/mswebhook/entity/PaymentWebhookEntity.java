package com.payment.mswebhook.entity;

//import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Table("paymentwebhook")
@Entity
public class PaymentWebhookEntity {
    public PaymentWebhookEntity(){}
    public PaymentWebhookEntity(Integer id,String checkoutRequestID,String merchantTransactionID,Integer requestStatusCode,String requestStatusDescription,String MSISDN,String serviceCode,
    String accountNumber,String currencyCode,double amountPaid,String requestCurrencyCode,Integer requestAmount,String requestDate,String[] payments,Integer serviceChargeAmount,
                                double originalRequestAmount,String originalRequestCurrencyCode,String[] failedPayments){
        super();
        this.id=id;
        this.checkoutRequestID=checkoutRequestID;
        this.merchantTransactionID=merchantTransactionID;
        this.requestStatusCode=requestStatusCode;
        this.requestStatusDescription=requestStatusDescription;
        this.MSISDN=MSISDN;
        this.serviceCode=serviceCode;
        this.accountNumber=accountNumber;
        this.currencyCode=currencyCode;
        this.amountPaid=amountPaid;
        this.requestCurrencyCode=requestCurrencyCode;
        this.requestAmount=requestAmount;
        this.requestDate=requestDate;
        this.payments=payments;
        this.serviceChargeAmount=serviceChargeAmount;
        this.originalRequestAmount=originalRequestAmount;
        this.originalRequestCurrencyCode=originalRequestCurrencyCode;
        this.failedPayments=failedPayments;

    }

    @Id
    @GeneratedValue
     public Integer id;
    public String checkoutRequestID;
    public String merchantTransactionID;
    public Integer requestStatusCode;
    public String requestStatusDescription;
    public String MSISDN;
    public String serviceCode;
    public String accountNumber;
    public String currencyCode;
    public double amountPaid;
    public String requestCurrencyCode;
    public Integer requestAmount;
    public String requestDate;
    public String[] payments;
    public Integer serviceChargeAmount;
    public double originalRequestAmount;
    public String originalRequestCurrencyCode;
    public  String[] failedPayments;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCheckoutRequestID() {
        return checkoutRequestID;
    }

    public void setCheckoutRequestID(String checkoutRequestID) {
        this.checkoutRequestID = checkoutRequestID;
    }

    public String getMerchantTransactionID() {
        return merchantTransactionID;
    }

    public void setMerchantTransactionID(String merchantTransactionID) {
        this.merchantTransactionID = merchantTransactionID;
    }

    public Integer getRequestStatusCode() {
        return requestStatusCode;
    }

    public void setRequestStatusCode(Integer requestStatusCode) {
        this.requestStatusCode = requestStatusCode;
    }

    public String getRequestStatusDescription() {
        return requestStatusDescription;
    }

    public void setRequestStatusDescription(String requestStatusDescription) {
        this.requestStatusDescription = requestStatusDescription;
    }

    public String getMSISDN() {
        return MSISDN;
    }

    public void setMSISDN(String MSISDN) {
        this.MSISDN = MSISDN;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(double amountPaid) {
        this.amountPaid = amountPaid;
    }

    public String getRequestCurrencyCode() {
        return requestCurrencyCode;
    }

    public void setRequestCurrencyCode(String requestCurrencyCode) {
        this.requestCurrencyCode = requestCurrencyCode;
    }

    public Integer getRequestAmount() {
        return requestAmount;
    }

    public void setRequestAmount(Integer requestAmount) {
        this.requestAmount = requestAmount;
    }

    public String getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(String requestDate) {
        this.requestDate = requestDate;
    }

    public String[] getPayments() {
        return payments;
    }

    public void setPayments(String[] payments) {
        this.payments = payments;
    }

    public Integer getServiceChargeAmount() {
        return serviceChargeAmount;
    }

    public void setServiceChargeAmount(Integer serviceChargeAmount) {
        this.serviceChargeAmount = serviceChargeAmount;
    }

    public double getOriginalRequestAmount() {
        return originalRequestAmount;
    }

    public void setOriginalRequestAmount(double originalRequestAmount) {
        this.originalRequestAmount = originalRequestAmount;
    }

    public String getOriginalRequestCurrencyCode() {
        return originalRequestCurrencyCode;
    }

    public void setOriginalRequestCurrencyCode(String originalRequestCurrencyCode) {
        this.originalRequestCurrencyCode = originalRequestCurrencyCode;
    }

    public String[] getFailedPayments() {
        return failedPayments;
    }

    public void setFailedPayments(String[] failedPayments) {
        this.failedPayments = failedPayments;
    }
}
