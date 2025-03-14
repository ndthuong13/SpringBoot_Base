package com.example.baitapvenhabuoi1.Exercise1.vehicle;

import org.springframework.stereotype.Component;

@Component
public class MotorBike implements Vehicle {
    @Override
    public void call() {
        System.out.println("Đây là xe máy");
    }
}
