package com.gulmall.gulmember.dao;

import com.gulmall.common.dao.BaseDao;
import com.gulmall.gulmember.entity.SmsCouponEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 *
 * @author scorevictim GmailNotExist@gmail.com
 * @since 1.0.0 2022-09-16
 */
@Mapper
public interface SmsCouponDao extends BaseDao<SmsCouponEntity> {
	
}