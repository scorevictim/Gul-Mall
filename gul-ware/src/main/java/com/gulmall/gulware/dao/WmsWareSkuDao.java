package com.gulmall.gulware.dao;

import com.gulmall.common.dao.BaseDao;
import com.gulmall.gulware.entity.WmsWareSkuEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 *
 * @author scorevictim GmailNotExist@gmail.com
 * @since 1.0.0 2022-09-16
 */
@Mapper
public interface WmsWareSkuDao extends BaseDao<WmsWareSkuEntity> {
	
}