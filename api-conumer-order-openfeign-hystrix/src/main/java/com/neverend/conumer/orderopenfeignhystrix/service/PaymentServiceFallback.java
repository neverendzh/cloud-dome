package com.neverend.conumer.orderopenfeignhystrix.service;

import com.neverend.commons.entity.CommonResult;
import com.neverend.commons.entity.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceFallback implements PaymentService {
    public CommonResult apiTimeOUt() {
        CommonResult commonResult = new CommonResult();
        commonResult.setCode(0);
        commonResult.setMessage("消费者服务降级返回，😄😫");
        return commonResult;
    }

    public CommonResult api() {
        return defaultFallback();
    }

    public CommonResult insert(Payment payment) {
        return defaultFallback();
    }

    public CommonResult getByid(Long id) {
        return defaultFallback();
    }

    public Object discoveryClient() {
        return defaultFallback();
    }

    public CommonResult getByid() {
        return defaultFallback();
    }


    public CommonResult defaultFallback() {
        CommonResult commonResult = new CommonResult();
        commonResult.setCode(500);
        commonResult.setMessage("service 默认全局降级处理,稍后在重试");
        return commonResult;
    }
}
