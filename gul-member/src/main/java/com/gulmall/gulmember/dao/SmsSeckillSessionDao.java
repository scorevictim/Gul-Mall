package com.gulmall.gulmember.dao;

import com.gulmall.common.dao.BaseDao;
import com.gulmall.gulmember.entity.SmsSeckillSessionEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动场次
 *
 * @author scorevictim GmailNotExist@gmail.com
 * @since 1.0.0 2022-09-16
 */
@Mapper
public interface SmsSeckillSessionDao extends BaseDao<SmsSeckillSessionEntity> {
	
}