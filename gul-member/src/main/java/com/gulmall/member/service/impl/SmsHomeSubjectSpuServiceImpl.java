package com.gulmall.member.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gulmall.common.service.impl.CrudServiceImpl;
import com.gulmall.member.dao.SmsHomeSubjectSpuDao;
import com.gulmall.member.dto.SmsHomeSubjectSpuDTO;
import com.gulmall.member.entity.SmsHomeSubjectSpuEntity;
import com.gulmall.member.service.SmsHomeSubjectSpuService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 专题商品
 *
 * @author scorevictim GmailNotExist@gmail.com
 * @since 1.0.0 2022-09-16
 */
@Service
public class SmsHomeSubjectSpuServiceImpl extends CrudServiceImpl<SmsHomeSubjectSpuDao, SmsHomeSubjectSpuEntity, SmsHomeSubjectSpuDTO> implements SmsHomeSubjectSpuService {

    @Override
    public QueryWrapper<SmsHomeSubjectSpuEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<SmsHomeSubjectSpuEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}