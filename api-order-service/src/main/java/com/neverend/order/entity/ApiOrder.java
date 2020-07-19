package com.neverend.order.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * api_order
 * @author 
 */
@Data
public class ApiOrder implements Serializable {
    private Long id;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 产品id
     */
    private Long productId;

    /**
     * 数量
     */
    private Integer byCount;

    /**
     * 金额
     */
    private BigDecimal money;

    /**
     * 订单状态0创建中,1完成
     */
    private Integer states;

    private static final long serialVersionUID = 1L;
}