package com.gulmall.member.dao;

import com.gulmall.common.dao.BaseDao;
import com.gulmall.member.entity.SmsCouponSpuRelationEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券与产品关联
 *
 * @author scorevictim GmailNotExist@gmail.com
 * @since 1.0.0 2022-09-16
 */
@Mapper
public interface SmsCouponSpuRelationDao extends BaseDao<SmsCouponSpuRelationEntity> {
	
}