package com.neverend.paymentzookeeper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient //该注解用于向consul或者zookeeper作为注册中心
public class Paymentzookeeper {
    public static void main(String[] args) {
        SpringApplication.run(Paymentzookeeper.class, args);
    }
}