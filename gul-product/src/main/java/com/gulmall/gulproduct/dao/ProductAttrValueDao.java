package com.gulmall.gulproduct.dao;

import com.gulmall.common.dao.BaseDao;
import com.gulmall.gulproduct.entity.ProductAttrValueEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * spu属性值
 *
 * @author Scorevictim GmailNotExist@gmail.com
 * @since 1.0.0 2022-09-14
 */
@Mapper
public interface ProductAttrValueDao extends BaseDao<ProductAttrValueEntity> {
	
}