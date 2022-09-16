package com.gulmall.member.dao;

import com.gulmall.common.dao.BaseDao;
import com.gulmall.member.entity.SmsCouponHistoryEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 *
 * @author scorevictim GmailNotExist@gmail.com
 * @since 1.0.0 2022-09-16
 */
@Mapper
public interface SmsCouponHistoryDao extends BaseDao<SmsCouponHistoryEntity> {
	
}