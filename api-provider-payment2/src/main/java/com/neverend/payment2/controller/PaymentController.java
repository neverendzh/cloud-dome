package com.neverend.payment2.controller;

import com.neverend.commons.entity.CommonResult;
import com.neverend.commons.entity.Payment;
import com.neverend.payment2.service.impl.PaymentServiceImpl;
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
}
