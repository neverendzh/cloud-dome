package com.neverend.account.controller;

import com.neverend.account.service.AccountService;
import com.neverend.commons.entity.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class AccountController {
    @Autowired
    private AccountService accountService;

    /**
     * 减用户余额
     * @param userId 商品ID
     * @param money 减去金额
     * @return
     */
    @PostMapping("/account/decrease")
    CommonResult decrease(@RequestParam("userId") Long userId,
                          @RequestParam("count") BigDecimal money){
       return accountService.decrease(userId,money);
    }
}
