package com.neverend.conumer.orderopenfeign.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {
    @Bean
    Logger.Level feignLogger() {
        return Logger.Level.FULL;
    }
}
