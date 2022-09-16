package com.gulmall.gulmember.dao;

import com.gulmall.common.dao.BaseDao;
import com.gulmall.gulmember.entity.SmsSeckillSkuRelationEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动商品关联
 *
 * @author scorevictim GmailNotExist@gmail.com
 * @since 1.0.0 2022-09-16
 */
@Mapper
public interface SmsSeckillSkuRelationDao extends BaseDao<SmsSeckillSkuRelationEntity> {
	
}