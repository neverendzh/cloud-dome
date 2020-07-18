package com.neverend.payment.controller;

import com.neverend.commons.entity.CommonResult;
import com.neverend.commons.entity.Payment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class NacosProviderController {

    @Value("${server.port}")
    private String serverPort;
    public static HashMap<Long, Payment> map = new HashMap<>();
    static {
        map.put(1001L,new Payment(1001L,"ONE"));
        map.put(1002L,new Payment(1002L,"TWO"));
        map.put(1003L,new Payment(1003L,"THREE"));

    }
    @GetMapping(value = "/payment/{id}")
    public CommonResult echo(@PathVariable Long  id) {
        Payment payment = map.get(id);
        return new CommonResult(200,"form api server port:"+serverPort,payment);
    }

}
