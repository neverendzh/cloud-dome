package com.neverend.sentinel.controler;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.neverend.commons.entity.CommonResult;
import com.neverend.commons.entity.Payment;
import com.neverend.sentinel.handler.CustomerBlockHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReatimitController {

    @GetMapping("/byResource")
    @SentinelResource(value = "byResource", blockHandler = "handlerException")
    public CommonResult byResource() {
        return new CommonResult(200, "按资源名称限流测试接口-INFO",
                new Payment(200L, "xxl"));

    }

    public CommonResult handlerException(BlockException e) {
        return new CommonResult(200,
                e.getClass().getCanonicalName() + "服务不可用-ERROR");

    }



    @GetMapping("/rateLimit/byUrl")
    @SentinelResource(value = "byUrl")
    public CommonResult byUrl() {
        return new CommonResult(200, "按URL限流测试接口-INFO",
                new Payment(200L, "xxl"));

    }

    @GetMapping("/rateLimit/customerBlockHandler")
    @SentinelResource(value = "customerBlockHandler",
            blockHandlerClass = CustomerBlockHandler.class,
            blockHandler = "handlerException1")
    public CommonResult customerBlockHandler() {
        return new CommonResult(200, "自定义限流处理-INFO",
                new Payment(200L, "xxl"));

    }
}
