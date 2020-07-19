package com.neverend.storage.dao;

import com.neverend.storage.entity.ApiStorage;
import com.neverend.storage.entity.ApiStorageExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * ApiStorageDAO继承基类
 */
@Mapper
@Repository
public interface ApiStorageDAO extends MyBatisBaseDao<ApiStorage, Long, ApiStorageExample> {
}