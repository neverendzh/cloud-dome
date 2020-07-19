package com.neverend.storage.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * api_storage
 * @author 
 */
@Data
public class ApiStorage implements Serializable {
    private Long id;

    /**
     * 产品id
     */
    private Long productId;

    /**
     * 总库存
     */
    private Integer proTotal;

    /**
     * 已使用库存
     */
    private Integer proUsed;

    /**
     * 剩余库存
     */
    private Integer residue;

    private static final long serialVersionUID = 1L;
}