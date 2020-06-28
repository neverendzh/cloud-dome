package com.neverend.nacosconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class NacosConfigClientApp {
    public static void main(String[] args) {
        SpringApplication.run(NacosConfigClientApp.class,args);
    }
}
