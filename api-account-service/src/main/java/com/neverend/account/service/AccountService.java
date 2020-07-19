package com.neverend.account.service;

import com.neverend.commons.entity.CommonResult;

import java.math.BigDecimal;

public interface AccountService {
    /**
     *
     * @param userId  用户id
     * @param money 消费金额
     * @return
     */
    CommonResult decrease(Long userId, BigDecimal money);
}
