package com.neverend.sentinel.controler;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlowLimitController {

    @GetMapping("/testa")
    public String testa(){
        return "testa";
    }
    @GetMapping("/testb")
    public String testb(){
        return "testb";
    }


    /**
     * 热点限流熔断方法
     * @param p1
     * @param p2
     * @return
     */
    @GetMapping("/testc")
    @SentinelResource(value = "testc",blockHandler = "deal_testC")
    public String testC(@RequestParam(name = "p1",required = false)String p1,
                        @RequestParam(name = "p2",required = false) String p2){
        return "testc";
    }

    public String deal_testC(@RequestParam(name = "p1",required = false)String p1,
                             @RequestParam(name = "p2",required = false) String p2, BlockException bl){
        return "deal_testC";
    }
}
