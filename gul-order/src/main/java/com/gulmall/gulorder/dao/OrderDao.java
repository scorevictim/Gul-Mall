package com.gulmall.gulorder.dao;

import com.gulmall.common.dao.BaseDao;
import com.gulmall.gulorder.entity.OrderEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 *
 * @author scorevictim GmailNotExist@gmail.com
 * @since 1.0.0 2022-09-16
 */
@Mapper
public interface OrderDao extends BaseDao<OrderEntity> {
	
}