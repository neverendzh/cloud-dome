package com.neverend.nacos.openfeign.service;


import com.neverend.commons.entity.CommonResult;
import com.neverend.commons.entity.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceFallback implements PaymentService {

    public CommonResult getByid(Long id) {
        return defaultFallback();
    }
    public CommonResult defaultFallback() {
        CommonResult commonResult = new CommonResult();
        commonResult.setCode(500);
        commonResult.setMessage("service 默认全局降级处理,稍后在重试");
        return commonResult;
    }
}
