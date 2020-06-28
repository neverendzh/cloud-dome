package com.neverend.nacos.cinfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
@Configuration
public class RestTemplateMy {

    //Instantiate RestTemplate Instance
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }


}
