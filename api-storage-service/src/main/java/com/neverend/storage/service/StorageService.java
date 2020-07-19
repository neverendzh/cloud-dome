package com.neverend.storage.service;

import com.neverend.commons.entity.CommonResult;

public interface StorageService {
    /**
     * 减库存
     * @param productId 商品id
     * @param count 数量
     * @return
     */
    CommonResult decrease( Long productId, Integer count);
}
