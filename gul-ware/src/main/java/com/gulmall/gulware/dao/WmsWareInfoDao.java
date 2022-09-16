package com.gulmall.gulware.dao;

import com.gulmall.common.dao.BaseDao;
import com.gulmall.gulware.entity.WmsWareInfoEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 仓库信息
 *
 * @author scorevictim GmailNotExist@gmail.com
 * @since 1.0.0 2022-09-16
 */
@Mapper
public interface WmsWareInfoDao extends BaseDao<WmsWareInfoEntity> {
	
}