package com.neverend.account.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * api_account
 * @author 
 */
@Data
public class ApiAccount implements Serializable {
    private Long id;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 总额度
     */
    private BigDecimal userTotal;

    /**
     * 已使用额度
     */
    private BigDecimal used;

    /**
     * 剩余额度
     */
    private BigDecimal residue;

    private static final long serialVersionUID = 1L;
}