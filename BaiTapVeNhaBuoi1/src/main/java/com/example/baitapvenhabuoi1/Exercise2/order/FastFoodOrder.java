package com.example.baitapvenhabuoi1.Exercise2.order;

import org.springframework.stereotype.Component;

@Component
public class FastFoodOrder implements Order {
    @Override
    public void placeOrder() {
        System.out.println("Đặt thức ăn nhanh");
    }
}
