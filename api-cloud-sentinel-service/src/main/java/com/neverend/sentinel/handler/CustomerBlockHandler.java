package com.neverend.sentinel.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.neverend.commons.entity.CommonResult;
import com.neverend.commons.entity.Payment;

public class CustomerBlockHandler {
    public static CommonResult handlerException1(BlockException e){
        return new CommonResult(500,"自定义异常处理1");
    }

    public static CommonResult handlerException2(BlockException e){
        return new CommonResult(500,"自定义异常处理2");
    }
}
