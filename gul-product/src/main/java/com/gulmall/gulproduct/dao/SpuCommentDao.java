package com.gulmall.gulproduct.dao;

import com.gulmall.common.dao.BaseDao;
import com.gulmall.gulproduct.entity.SpuCommentEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价
 *
 * @author scorevictim GmailNotExist@gmail.com
 * @since 1.0.0 2022-09-14
 */
@Mapper
public interface SpuCommentDao extends BaseDao<SpuCommentEntity> {
	
}