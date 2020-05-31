package com.neverend.payment.hystrix.service.impl;

import cn.hutool.core.util.IdUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.neverend.commons.entity.CommonResult;
import com.neverend.commons.entity.Payment;
import com.neverend.payment.hystrix.dao.PaymentDAO;
import com.neverend.payment.hystrix.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

@Service
@Slf4j
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDAO paymentDAO;

    public int insert(Payment record) {
        return paymentDAO.insert(record);

    }

    public Payment selectByPrimaryKey(Long id) {
        return paymentDAO.selectByPrimaryKey(id);
    }

    public CommonResult api() {
        log.info("线程池：" + Thread.currentThread().getName() + "getApi_OK——OK——😄");
        CommonResult commonResult = new CommonResult();
        commonResult.CommonResultOK(0, "getApi_OK——OK——😄");
        return commonResult;
    }

    @HystrixCommand(fallbackMethod = "apiTimeOUtHander",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "1000")
    })
    public CommonResult apiTimeOUt() {
//        int a = 10/0;
        int timems = 5;
        try { TimeUnit.SECONDS.sleep(timems); } catch (InterruptedException e) { log.error("timeOut", e); }
        log.info("线程池：" + Thread.currentThread().getName() + "apiTimeOUt——TimeOUT——😫"+"耗时："+timems);
        CommonResult commonResult = new CommonResult();
        commonResult.CommonResultOK(0, "apiTimeOUt——TimeOUT——😫"+"耗时："+timems);
        return commonResult;
    }

    public CommonResult apiTimeOUtHander() {
        log.info("线程池：" + Thread.currentThread().getName() + "fallbackMethod——TimeOUT——😄");
        CommonResult commonResult = new CommonResult();
        commonResult.CommonResultOK(0, "apiTimeOUtHander——TimeOUT——😄"+"fallbackMethod");
        return commonResult;
    }


    //    服务熔断￿￿
    @HystrixCommand(fallbackMethod = "paymentCircuitBreakerFallback",commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled",value = "true"),//是否开启断路器
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"),//请求错误次数 默认20
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"),//时间窗口期ms 5000 ms
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60") // 50 默认 失败次数达到多少后熔断//表示10s到达60次错误是熔断
    })
    public String paymentCircuitBreaker(Integer id){
        if (id<0){
            throw new RuntimeException("id <0");
        }
        String number = IdUtil.simpleUUID();
        return Thread.currentThread().getName()+"\t"+"调用成功，流水号："+number;
    }

    public String paymentCircuitBreakerFallback(@PathVariable("id") Integer id){
        return "id 错误，稍后再是，fallback";
    }
}
