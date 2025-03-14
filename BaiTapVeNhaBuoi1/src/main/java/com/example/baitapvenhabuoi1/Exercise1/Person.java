package com.example.baitapvenhabuoi1.Exercise1;

import com.example.baitapvenhabuoi1.Exercise1.engine.ElectricEngine;
import com.example.baitapvenhabuoi1.Exercise1.engine.Engine;
import com.example.baitapvenhabuoi1.Exercise1.vehicle.MotorBike;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private Engine engine;
    private MotorBike motorBike;

    @Autowired
    public Person(@Qualifier("motorBike") MotorBike motorBike, @Qualifier("electricEngine") ElectricEngine electricEngine) {
        this.motorBike = motorBike;
        this.engine = electricEngine;
    }

    public void makeCall(){
        motorBike.call();
        engine.call();
    }

}
