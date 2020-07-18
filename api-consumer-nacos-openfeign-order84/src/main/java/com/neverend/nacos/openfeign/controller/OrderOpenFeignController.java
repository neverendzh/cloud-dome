package com.neverend.nacos.openfeign.controller;

import com.neverend.commons.entity.CommonResult;
import com.neverend.nacos.openfeign.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderOpenFeignController {
    @Autowired
    private PaymentService paymentService;

    @GetMapping("/consumer/payment/{id}")
    public CommonResult getByid(@PathVariable("id") Long id) {
        return paymentService.getByid(id);
    }

}
