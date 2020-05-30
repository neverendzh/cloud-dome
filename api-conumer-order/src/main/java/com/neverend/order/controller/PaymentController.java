package com.neverend.order.controller;

import com.neverend.commons.entity.CommonResult;
import com.neverend.commons.entity.Payment;
import com.neverend.order.lb.LoadBalancer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Slf4j
public class PaymentController {

    //private static final String url = "http://127.0.0.1:8001";
    private static final String url = "http://API-PAYMENT-SERVICE";
    @Resource
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancer loadBalancer;
    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/api")
    public CommonResult getApi() {
        log.info("consumer-执行插入");
        return restTemplate.getForObject(url + "/api", CommonResult.class);

    }

    @GetMapping("/consumer/insert")
    public CommonResult<Payment> insert(Payment payment) {
        log.info("consumer-执行插入");
        return restTemplate.postForObject(url + "/insert", payment, CommonResult.class);
    }

    @GetMapping("/consumer/getById/{id}")
    public CommonResult getByid(@PathVariable("id") Long id) {
        log.info("consumer-执行查询");
        return restTemplate.getForObject(url + "/getById/" + id, CommonResult.class);
    }

    @GetMapping("/consumer/lb/getById/{id}")
    public CommonResult getByidlb(@PathVariable("id") Long id) {
        List<ServiceInstance> instances = discoveryClient.getInstances("API-PAYMENT-SERVICE");
        ServiceInstance instance = loadBalancer.instance(instances);
        log.info("consumer-执行查询");
        return restTemplate.getForObject(instance.getUri() + "/getById/" + id, CommonResult.class);
    }
}
