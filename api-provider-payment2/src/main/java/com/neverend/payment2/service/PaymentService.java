package com.neverend.payment2.service;

import com.neverend.commons.entity.Payment;

public interface PaymentService {
    int insert(Payment record);

    Payment selectByPrimaryKey(Long id);
}
