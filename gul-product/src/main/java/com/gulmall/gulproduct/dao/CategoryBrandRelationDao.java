package com.gulmall.gulproduct.dao;

import com.gulmall.common.dao.BaseDao;
import com.gulmall.gulproduct.entity.CategoryBrandRelationEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 品牌分类关联
 *
 * @author Scorevictim GmailNotExist@gmail.com
 * @since 1.0.0 2022-09-14
 */
@Mapper
public interface CategoryBrandRelationDao extends BaseDao<CategoryBrandRelationEntity> {
	
}