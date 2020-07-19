package com.neverend.order.controller;

import com.neverend.commons.entity.CommonResult;
import com.neverend.order.entity.ApiOrder;
import com.neverend.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;
    @GetMapping("/creat/order")
    public CommonResult creatOrder(ApiOrder apiOrder){
        orderService.creatOrder(apiOrder);
        return new CommonResult(200,"创建订单完成");
    }
}

