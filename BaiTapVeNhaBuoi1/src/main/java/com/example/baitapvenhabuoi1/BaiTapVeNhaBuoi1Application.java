package com.example.baitapvenhabuoi1;

import com.example.baitapvenhabuoi1.Exercise1.Person;
import com.example.baitapvenhabuoi1.Exercise2.customer.Customer;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class BaiTapVeNhaBuoi1Application {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.example.baitapvenhabuoi1");
        Person person = context.getBean(Person.class);
        person.makeCall();

        Customer customer = context.getBean(Customer.class);
        customer.makePayment();
    }

}

