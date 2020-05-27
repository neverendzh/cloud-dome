package com.neverend.payment.consul.service;

import com.neverend.commons.entity.Payment;

public interface PaymentService {
    int insert(Payment record);

    Payment selectByPrimaryKey(Long id);
}
