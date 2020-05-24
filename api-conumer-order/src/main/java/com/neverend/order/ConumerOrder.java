package com.neverend.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ConumerOrder {
    public static void main(String[] args) {
        SpringApplication.run(ConumerOrder.class, args);
    }
}
