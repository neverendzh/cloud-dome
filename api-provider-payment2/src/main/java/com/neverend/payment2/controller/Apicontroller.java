package com.neverend.payment2.controller;

import com.neverend.commons.entity.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class Apicontroller {
    @GetMapping("/api")
    public CommonResult getApi() {
        log.info("api");
        CommonResult commonResult = new CommonResult();
        commonResult.CommonResultOK(0, "sucess");
        return commonResult;
    }
}
