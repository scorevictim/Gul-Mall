package com.gulmall.member.dao;

import com.gulmall.common.dao.BaseDao;
import com.gulmall.member.entity.SmsHomeSubjectEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author scorevictim GmailNotExist@gmail.com
 * @since 1.0.0 2022-09-16
 */
@Mapper
public interface SmsHomeSubjectDao extends BaseDao<SmsHomeSubjectEntity> {
	
}