package com.neverend.order.service;

import com.neverend.commons.entity.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

@FeignClient("seata-account-service")
@Component
public interface AccountService {
    /**
     * 减用户余额
     * @param userId 商品ID
     * @param money 减去金额
     * @return
     */
    @PostMapping("/account/decrease")
    CommonResult decrease(@RequestParam("userId") Long userId,
                          @RequestParam("count") BigDecimal money);
}
