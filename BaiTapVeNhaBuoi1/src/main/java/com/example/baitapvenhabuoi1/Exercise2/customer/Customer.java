package com.example.baitapvenhabuoi1.Exercise2.customer;

import com.example.baitapvenhabuoi1.Exercise2.order.FastFoodOrder;
import com.example.baitapvenhabuoi1.Exercise2.order.HealthyFoodOrder;
import com.example.baitapvenhabuoi1.Exercise2.payment.CreditCardPayment;
import com.example.baitapvenhabuoi1.Exercise2.payment.PayPalPayment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Customer {
    private FastFoodOrder fastFoodOrder;
    private HealthyFoodOrder healthyFoodOrder;
    private CreditCardPayment creditCardPayment;
    private PayPalPayment payPalPayment;

    @Autowired
    public Customer(@Qualifier("fastFoodOrder") FastFoodOrder fastFoodOrder, @Qualifier("creditCardPayment") CreditCardPayment creditCardPayment) {
        this.fastFoodOrder = fastFoodOrder;
        this.creditCardPayment = creditCardPayment;
    }

    public void makePayment(){
        fastFoodOrder.placeOrder();
        creditCardPayment.pay();
    }

}
