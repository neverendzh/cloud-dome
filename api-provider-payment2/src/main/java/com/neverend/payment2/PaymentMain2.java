package com.neverend.payment2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PaymentMain2 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain2.class, args);
    }
}