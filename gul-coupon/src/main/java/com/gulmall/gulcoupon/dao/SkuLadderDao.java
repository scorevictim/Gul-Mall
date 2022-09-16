package com.gulmall.gulcoupon.dao;

import com.gulmall.common.dao.BaseDao;
import com.gulmall.gulcoupon.entity.SkuLadderEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品阶梯价格
 *
 * @author scorevictim GmailNotExist@gmail.com
 * @since 1.0.0 2022-09-16
 */
@Mapper
public interface SkuLadderDao extends BaseDao<SkuLadderEntity> {
	
}