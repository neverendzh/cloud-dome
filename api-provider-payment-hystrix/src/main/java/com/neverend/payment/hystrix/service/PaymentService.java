package com.neverend.payment.hystrix.service;

import com.neverend.commons.entity.CommonResult;
import com.neverend.commons.entity.Payment;

public interface PaymentService {
    int insert(Payment record);

    Payment selectByPrimaryKey(Long id);

    /**
     * @return
     */
    CommonResult api();
}
