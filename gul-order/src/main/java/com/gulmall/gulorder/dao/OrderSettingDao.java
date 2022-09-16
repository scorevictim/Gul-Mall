package com.gulmall.gulorder.dao;

import com.gulmall.common.dao.BaseDao;
import com.gulmall.gulorder.entity.OrderSettingEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 *
 * @author scorevictim GmailNotExist@gmail.com
 * @since 1.0.0 2022-09-16
 */
@Mapper
public interface OrderSettingDao extends BaseDao<OrderSettingEntity> {
	
}