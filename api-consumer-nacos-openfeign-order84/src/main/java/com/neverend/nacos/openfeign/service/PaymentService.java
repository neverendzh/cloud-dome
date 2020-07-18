package com.neverend.nacos.openfeign.service;

import com.neverend.commons.entity.CommonResult;
import com.neverend.commons.entity.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@FeignClient(value = "payment-nacos-provider",fallback = PaymentServiceFallback.class)
public interface PaymentService {

    @GetMapping("/payment/{id}")
    CommonResult getByid(@PathVariable("id") Long id);

}
