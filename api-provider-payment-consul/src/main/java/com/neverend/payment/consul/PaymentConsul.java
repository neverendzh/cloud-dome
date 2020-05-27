package com.neverend.payment.consul;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PaymentConsul {
    public static void main(String[] args) {
        SpringApplication.run(PaymentConsul.class, args);
    }

}
