package com.gulmall.member.dao;

import com.gulmall.common.dao.BaseDao;
import com.gulmall.member.entity.SmsSeckillSkuNoticeEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀商品通知订阅
 *
 * @author scorevictim GmailNotExist@gmail.com
 * @since 1.0.0 2022-09-16
 */
@Mapper
public interface SmsSeckillSkuNoticeDao extends BaseDao<SmsSeckillSkuNoticeEntity> {
	
}