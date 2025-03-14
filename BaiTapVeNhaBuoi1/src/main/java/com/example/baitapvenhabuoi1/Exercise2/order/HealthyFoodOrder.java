package com.example.baitapvenhabuoi1.Exercise2.order;

import org.springframework.stereotype.Component;

@Component
public class HealthyFoodOrder implements Order {
    @Override
    public void placeOrder() {
        System.out.println("Đặt đồ ăn tốt cho sức khoẻ");
    }
}
