package com.neverend.conumer.orderopenfeign.controller;

import com.neverend.commons.entity.CommonResult;
import com.neverend.commons.entity.Payment;
import com.neverend.conumer.orderopenfeign.service.PaymentService;
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
    @Autowired
    private PaymentService paymentService;

    @GetMapping("/api")
    public CommonResult getApi() {
        log.info("feign-执行插入");
        return paymentService.getApi();

    }

    @GetMapping("/consumer/insert")
    public CommonResult<Payment> insert(Payment payment) {
        log.info("consumer-执行插入");
        return paymentService.insert(payment);
    }

    @GetMapping("/consumer/getById/{id}")
    public CommonResult getByid(@PathVariable("id") Long id) {
        log.info("consumer-执行查询");
        return paymentService.getByid(id);
    }
    @GetMapping("/timeout/test")
    public CommonResult getByid() {
        return paymentService.getByid();
    }
}
