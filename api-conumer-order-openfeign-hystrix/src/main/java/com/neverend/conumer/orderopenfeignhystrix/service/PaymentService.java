package com.neverend.conumer.orderopenfeignhystrix.service;

import com.neverend.commons.entity.CommonResult;
import com.neverend.commons.entity.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@FeignClient("API-PAYMENT-SERVICE-HYSTRIX")
public interface PaymentService {
    @GetMapping("/api")
    CommonResult apiTimeOUt();

    @GetMapping("/api/plus")
    CommonResult api();

    @RequestMapping("/insert")
    CommonResult insert(@RequestBody Payment payment);

    @GetMapping("/getById/{id}")
    CommonResult getByid(@PathVariable("id") Long id);

    @GetMapping("/payment/discovery")
    public Object discoveryClient();

    @GetMapping("/timeout/test")
    public CommonResult getByid();
}
