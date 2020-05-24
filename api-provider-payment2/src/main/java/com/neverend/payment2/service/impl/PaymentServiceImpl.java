package com.neverend.payment2.service.impl;

import com.neverend.commons.entity.Payment;
import com.neverend.payment2.dao.PaymentDAO;
import com.neverend.payment2.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDAO paymentDAO;

    public int insert(Payment record) {
        return paymentDAO.insert(record);

    }

    public Payment selectByPrimaryKey(Long id) {
        return paymentDAO.selectByPrimaryKey(id);
    }
}
