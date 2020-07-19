package com.neverend.account.dao;

import com.neverend.account.entity.ApiAccount;
import com.neverend.account.entity.ApiAccountExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * ApiAccountDAO继承基类
 */
@Mapper
@Repository
public interface ApiAccountDAO extends MyBatisBaseDao<ApiAccount, Long, ApiAccountExample> {
}