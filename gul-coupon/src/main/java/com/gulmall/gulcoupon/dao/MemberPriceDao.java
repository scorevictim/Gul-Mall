package com.gulmall.gulcoupon.dao;

import com.gulmall.common.dao.BaseDao;
import com.gulmall.gulcoupon.entity.MemberPriceEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 *
 * @author scorevictim GmailNotExist@gmail.com
 * @since 1.0.0 2022-09-16
 */
@Mapper
public interface MemberPriceDao extends BaseDao<MemberPriceEntity> {
	
}