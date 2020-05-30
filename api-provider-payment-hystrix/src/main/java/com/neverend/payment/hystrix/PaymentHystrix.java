package com.neverend.payment.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication
@EnableCircuitBreaker
public class PaymentHystrix {
    public static void main(String[] args) {
        SpringApplication.run(PaymentHystrix.class,args);
    }
}
