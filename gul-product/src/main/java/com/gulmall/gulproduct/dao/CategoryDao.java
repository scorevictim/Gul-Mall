package com.gulmall.gulproduct.dao;

import com.gulmall.common.dao.BaseDao;
import com.gulmall.gulproduct.entity.CategoryEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 *
 * @author scorevictim GmailNotExist@gmail.com
 * @since 1.0.0 2022-09-14
 */
@Mapper
public interface CategoryDao extends BaseDao<CategoryEntity> {
	
}