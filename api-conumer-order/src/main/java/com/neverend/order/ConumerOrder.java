package com.neverend.order;

import com.neverend.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
//启动的时候加载自定义的负载均衡配置类，指定服务名称，如果包放在启动类及其子包下，会影响所有服务的负载均衡算法
//@RibbonClient(name = "API-PAYMENT-SERVICE",configuration = MySelfRule.class)
public class ConumerOrder {
    public static void main(String[] args) {
        SpringApplication.run(ConumerOrder.class, args);
    }
}
