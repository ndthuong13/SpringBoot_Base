package com.example.baitapvenhabuoi1.Exercise2.payment;

import org.springframework.stereotype.Component;

@Component
public class PayPalPayment implements PaymentMethod {
    @Override
    public void pay() {
        System.out.println("Thanh toán bằng ví Paypal");
    }
}
