package com.gulmall.gulcoupon.dao;

import com.gulmall.common.dao.BaseDao;
import com.gulmall.gulcoupon.entity.CouponSpuRelationEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券与产品关联
 *
 * @author scorevictim GmailNotExist@gmail.com
 * @since 1.0.0 2022-09-16
 */
@Mapper
public interface CouponSpuRelationDao extends BaseDao<CouponSpuRelationEntity> {
	
}