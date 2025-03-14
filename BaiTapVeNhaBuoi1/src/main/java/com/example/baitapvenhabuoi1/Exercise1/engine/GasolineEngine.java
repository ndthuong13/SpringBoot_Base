package com.example.baitapvenhabuoi1.Exercise1.engine;

import org.springframework.stereotype.Component;

@Component
public class GasolineEngine implements Engine {

    @Override
    public void call() {
        System.out.println("Động cơ chạy bằng nhiên liệu hoá thạch");
    }
}
