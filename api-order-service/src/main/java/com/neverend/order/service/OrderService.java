package com.neverend.order.service;

import com.neverend.commons.entity.CommonResult;
import com.neverend.order.entity.ApiOrder;

public interface OrderService {

    CommonResult creatOrder(ApiOrder apiOrder);
}
