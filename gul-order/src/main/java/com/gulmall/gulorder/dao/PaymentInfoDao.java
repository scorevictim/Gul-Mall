package com.gulmall.gulorder.dao;

import com.gulmall.common.dao.BaseDao;
import com.gulmall.gulorder.entity.PaymentInfoEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 *
 * @author scorevictim GmailNotExist@gmail.com
 * @since 1.0.0 2022-09-16
 */
@Mapper
public interface PaymentInfoDao extends BaseDao<PaymentInfoEntity> {
	
}