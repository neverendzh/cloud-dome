package com.neverend.payment.controller;

import com.neverend.commons.entity.CommonResult;
import com.neverend.commons.entity.Payment;
import com.neverend.payment.service.impl.PaymentServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
public class PaymentController {
    @Autowired
    private PaymentServiceImpl paymentService;
    @Value("${server.port}")
    private String servePort;

    @Autowired
    private DiscoveryClient discoveryClient;

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

    @GetMapping("/payment/discovery")
    public Object discoveryClient(){
        List<String> services = discoveryClient.getServices();
        for (String service : services) {
            log.info("***element*****"+service);
        }
        List<ServiceInstance> instances = discoveryClient.getInstances("API-PAYMENT-SERVICE");
        for (ServiceInstance instance : instances) {
            log.info("instance---"+instance.getServiceId()+"\t"+instance.getHost()+"\t"+instance.getPort()+"\t"+instance.getUri());
        }
        return this.discoveryClient;
    }
}
