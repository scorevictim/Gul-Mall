package com.gulmall.gulproduct.dao;

import com.gulmall.common.dao.BaseDao;
import com.gulmall.gulproduct.entity.CommentReplayEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 *
 * @author scorevictim GmailNotExist@gmail.com
 * @since 1.0.0 2022-09-14
 */
@Mapper
public interface CommentReplayDao extends BaseDao<CommentReplayEntity> {
	
}