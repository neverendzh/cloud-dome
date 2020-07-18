package com.neverend.nacos.order.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.neverend.commons.entity.CommonResult;
import com.neverend.commons.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    //   服务名名称
    @Value("${service-url.nacos-user-service}")
    private String serverName;

    @GetMapping("/echo/app-name/{id}")
//    @SentinelResource(value = "fallback")
//    @SentinelResource(value = "fallback", fallback = "defaultFallback") //  异常业务处理方法配置
//    @SentinelResource(value = "fallback", blockHandler = "blockHandler") //  sentinel控制台违规处理，限流，异常数等 处理方法 配置
//    @SentinelResource(value = "fallback",fallback = "defaultFallback", blockHandler = "blockHandler") // 异常业务处理方法配置，  sentinel控制台违规处理，限流，异常数等 处理方法 配置
    @SentinelResource(value = "fallback",fallback = "defaultFallback", blockHandler = "blockHandler"
    ,exceptionsToIgnore = {IllegalArgumentException.class})  //异常忽略配置
    public CommonResult fallback(@PathVariable Long id) {
        if (id.intValue() == 1) {
            throw new IllegalArgumentException("参数错误");
        }
        CommonResult<Payment> forObject = restTemplate.getForObject(serverName + "/payment/" + id, CommonResult.class, id);
        if (forObject.getData() == null) {
            throw new NullPointerException("无数据 NullPointerException");
        }
        return forObject;
    }

    public CommonResult defaultFallback(@PathVariable Long id, Throwable e) {
        return new CommonResult(500, e.getMessage(), new Payment(id, null));
    }

    public CommonResult blockHandler(@PathVariable Long id, BlockException e) {
        return new CommonResult(404,"BlockException--sentinel限流，无数据"+ e.getMessage());
    }
}
