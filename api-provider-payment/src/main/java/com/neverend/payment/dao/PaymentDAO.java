package com.neverend.payment.dao;

import com.neverend.commons.entity.Payment;
import com.neverend.commons.entity.PaymentExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * PaymentDAO继承基类
 */
@Mapper
@Repository
public interface PaymentDAO extends MyBatisBaseDao<Payment, Long, PaymentExample> {
}