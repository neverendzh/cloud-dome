package com.neverend.order.service.impl;

import com.neverend.commons.entity.CommonResult;
import com.neverend.order.dao.ApiOrderDAO;
import com.neverend.order.entity.ApiOrder;
import com.neverend.order.entity.ApiOrderExample;
import com.neverend.order.service.AccountService;
import com.neverend.order.service.OrderService;
import com.neverend.order.service.StorageService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class OrderServiceImpl implements OrderService {
    @Autowired
    private ApiOrderDAO apiOrderDAO;
    @Autowired
    private AccountService accountService;
    @Autowired
    private StorageService storageService;
    /**
     * 创建订单
     * @param apiOrder
     * @return
     */
    @Override
    @GlobalTransactional
    public CommonResult creatOrder(ApiOrder apiOrder) {
//        创建订单
        log.info("---->开始创建订单");
        apiOrder.setStates(0);
        apiOrderDAO.insert(apiOrder);
        log.info("----->创建订单完成");
//        减库存
        log.info("开始调用减库存操作");
        CommonResult decrease = storageService.decrease(apiOrder.getProductId(), apiOrder.getByCount());
        log.info("----->减库存操作调用完成，返回信息："+decrease);
        if (decrease.getCode().intValue() == 200){
            log.info("----->减库存操作完成：code："+decrease.getCode());
        }else {
            log.error("减库存失败：msg"+decrease.getMessage());
        }
//      减用户余额
        log.info("----->开始减用户余额");
        CommonResult decrease1 = accountService.decrease(apiOrder.getUserId(), apiOrder.getMoney());
        log.info("----->开始减用户余额调用完成："+decrease1);
        if (decrease1.getCode().intValue() == 200){
            log.info("----->减用户余额完成："+decrease1.getMessage());
        }else {
            log.error("减用户余额完成"+decrease1.getMessage());
        }
//      修改订单状态
        log.info("----->修改订单状态");
        ApiOrder apiOrder1 = new ApiOrder();
        apiOrder1.setStates(1);
        ApiOrderExample apiOrderExample = new ApiOrderExample();
        ApiOrderExample.Criteria criteria = apiOrderExample.createCriteria();
        criteria.andUserIdEqualTo(apiOrder.getUserId());
        apiOrderDAO.updateByExampleSelective(apiOrder1,apiOrderExample);
        log.info("----->修改订单状态完成");
        return new CommonResult(200,"ok");
    }
}
