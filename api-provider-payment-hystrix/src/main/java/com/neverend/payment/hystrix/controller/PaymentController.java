package com.neverend.payment.hystrix.controller;

import cn.hutool.core.util.IdUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.neverend.commons.entity.CommonResult;
import com.neverend.commons.entity.Payment;
import com.neverend.payment.hystrix.service.impl.PaymentServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class PaymentController {
    @Autowired
    private PaymentServiceImpl paymentService;
    @Value("${server.port}")
    private String servePort;
    @RequestMapping("/insert")
    public CommonResult insert(@RequestBody Payment payment) {
        int insert = paymentService.insert(payment);
        if (insert > 0) {
            return new CommonResult(0, "sucess"+servePort, insert);
        } else {
            return new CommonResult(500, "error"+servePort, insert);
        }
    }


    @GetMapping("/getById/{id}")
    public CommonResult getByid(@PathVariable("id") Long id) {
        Payment payment = paymentService.selectByPrimaryKey(id);
        log.info("查询成功：" + payment);
        return new CommonResult(0, "sucess"+servePort, payment);
    }
    @GetMapping("/timeout/test")
    public CommonResult getByid() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            log.error("timout",e);
        }
        return new CommonResult(0,"sucess"+servePort,null);
    }
//    服务熔断

    @GetMapping("/payment/circuit/breaker/{id}")
    public String paymentCircuitBreaker(@PathVariable("id") Integer id){
       return paymentService.paymentCircuitBreaker(id);
    }


}
