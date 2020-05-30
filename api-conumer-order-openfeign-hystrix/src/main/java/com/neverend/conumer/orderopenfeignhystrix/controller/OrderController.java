package com.neverend.conumer.orderopenfeignhystrix.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.neverend.commons.entity.CommonResult;
import com.neverend.commons.entity.Payment;
import com.neverend.conumer.orderopenfeignhystrix.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@DefaultProperties(defaultFallback = "defaultFallback")
public class OrderController {
    @Autowired
    private PaymentService paymentService;

    @GetMapping("/consumer/api")
    @HystrixCommand(fallbackMethod = "getApiHander", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "2000")
    })
    public CommonResult getApi() {
        return paymentService.apiTimeOUt();
    }

    public CommonResult getApiHander() {
        CommonResult commonResult = new CommonResult();
        commonResult.setCode(0);
        commonResult.setMessage("消费者服务降级返回，😄😫");
        return commonResult;
    }

    @HystrixCommand
    @GetMapping("/consumer/api/plus")
    public CommonResult getApiplus() {
        int a = 1 / 0;
        return paymentService.api();
    }

    @HystrixCommand
    @GetMapping("/consumer/insert")
    public CommonResult<Payment> insert(Payment payment) {
        log.info("consumer-执行插入");
        return paymentService.insert(payment);
    }

    @HystrixCommand
    @GetMapping("/consumer/getById/{id}")
    public CommonResult getByid(@PathVariable("id") Long id) {
        log.info("consumer-执行查询");
        return paymentService.getByid(id);
    }

    @HystrixCommand
    @GetMapping("/timeout/test")
    public CommonResult getByid() {
        return paymentService.getByid();
    }

    public CommonResult defaultFallback() {
        CommonResult commonResult = new CommonResult();
        commonResult.setCode(500);
        commonResult.setMessage("默认全局降级处理,稍后在重试");
        return commonResult;
    }
}
