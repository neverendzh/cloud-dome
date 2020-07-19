package com.neverend.order.dao;

import com.neverend.order.entity.ApiOrder;
import com.neverend.order.entity.ApiOrderExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * ApiOrderDAO继承基类
 */
@Mapper
@Repository
public interface ApiOrderDAO extends MyBatisBaseDao<ApiOrder, Long, ApiOrderExample> {
}