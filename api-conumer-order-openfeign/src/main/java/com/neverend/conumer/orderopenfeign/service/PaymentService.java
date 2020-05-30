package com.neverend.conumer.orderopenfeign.service;

import com.neverend.commons.entity.CommonResult;
import com.neverend.commons.entity.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@Component
@FeignClient("API-PAYMENT-SERVICE")
public interface PaymentService {

    @GetMapping("/api")
    CommonResult getApi();

    @RequestMapping("/insert")
    CommonResult insert(@RequestBody Payment payment);

    @GetMapping("/getById/{id}")
    CommonResult getByid(@PathVariable("id") Long id);

    @GetMapping("/payment/discovery")
    public Object discoveryClient();
    @GetMapping("/timeout/test")
    public CommonResult getByid();
}
