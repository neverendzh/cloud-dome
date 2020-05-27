package com.neverend.order.consul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConmerOrderConsul {
    public static void main(String[] args) {
        SpringApplication.run(ConmerOrderConsul.class, args);
    }

}
