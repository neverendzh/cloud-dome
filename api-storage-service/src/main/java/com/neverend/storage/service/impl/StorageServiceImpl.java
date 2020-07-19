package com.neverend.storage.service.impl;

import com.neverend.commons.entity.CommonResult;
import com.neverend.storage.dao.ApiStorageDAO;
import com.neverend.storage.entity.ApiStorage;
import com.neverend.storage.entity.ApiStorageExample;
import com.neverend.storage.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class StorageServiceImpl implements StorageService {
    @Autowired
    private ApiStorageDAO apiStorageDAO;
    /**
     * 减库存
     *
     * @param productId 商品id
     * @param count     数量
     * @return
     */
    @Override
    public CommonResult decrease(Long productId, Integer count) {
        log.info("---->开始减库存");
        ApiStorageExample apiStorageExample = new ApiStorageExample();
        ApiStorageExample.Criteria criteria = apiStorageExample.createCriteria();
        criteria.andProductIdEqualTo(productId);
        List<ApiStorage> apiStorages = apiStorageDAO.selectByExample(apiStorageExample);
        ApiStorage apiStorage = apiStorages.get(0);
        apiStorage.setResidue(apiStorage.getResidue()-count);
        apiStorage.setProUsed(apiStorage.getProUsed()+count);
        apiStorageDAO.updateByPrimaryKeySelective(apiStorage);
        log.info("---->减库存成功");
        return new CommonResult(200,"减库存成功");
    }
}
