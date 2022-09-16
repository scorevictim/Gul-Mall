package com.gulmall.gulcoupon.dao;

import com.gulmall.common.dao.BaseDao;
import com.gulmall.gulcoupon.entity.SeckillSkuRelationEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动商品关联
 *
 * @author scorevictim GmailNotExist@gmail.com
 * @since 1.0.0 2022-09-16
 */
@Mapper
public interface SeckillSkuRelationDao extends BaseDao<SeckillSkuRelationEntity> {
	
}