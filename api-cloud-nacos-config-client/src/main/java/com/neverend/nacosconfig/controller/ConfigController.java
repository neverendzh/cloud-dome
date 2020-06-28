package com.neverend.nacosconfig.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope //支持nacos动态刷新功能
public class ConfigController {
    @Value("${config.info}")
    private String configINfo;
    @GetMapping("/config/info")
    public String getConfigINfo(){
        return configINfo;
    }
}
