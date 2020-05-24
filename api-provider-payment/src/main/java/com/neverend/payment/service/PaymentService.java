package com.neverend.payment.service;

import com.neverend.commons.entity.Payment;

public interface PaymentService {
    int insert(Payment record);

    Payment selectByPrimaryKey(Long id);
}
