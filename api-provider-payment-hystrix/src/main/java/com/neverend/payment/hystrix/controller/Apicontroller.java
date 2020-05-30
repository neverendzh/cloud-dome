package com.neverend.payment.hystrix.controller;

import com.neverend.commons.entity.CommonResult;
import com.neverend.payment.hystrix.service.impl.PaymentServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class Apicontroller {
    @Autowired
    private PaymentServiceImpl paymentService;

    @GetMapping("/api")
    public CommonResult getApi() {
        return   paymentService.apiTimeOUt();
    }

    @GetMapping("/api/plus")
    public CommonResult getApiplus() {
      return   paymentService.api();
    }
}
