package com.gulmall.gulmember.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gulmall.common.service.impl.CrudServiceImpl;
import com.gulmall.gulmember.dao.SmsHomeSubjectDao;
import com.gulmall.gulmember.dto.SmsHomeSubjectDTO;
import com.gulmall.gulmember.entity.SmsHomeSubjectEntity;
import com.gulmall.gulmember.service.SmsHomeSubjectService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author scorevictim GmailNotExist@gmail.com
 * @since 1.0.0 2022-09-16
 */
@Service
public class SmsHomeSubjectServiceImpl extends CrudServiceImpl<SmsHomeSubjectDao, SmsHomeSubjectEntity, SmsHomeSubjectDTO> implements SmsHomeSubjectService {

    @Override
    public QueryWrapper<SmsHomeSubjectEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<SmsHomeSubjectEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}