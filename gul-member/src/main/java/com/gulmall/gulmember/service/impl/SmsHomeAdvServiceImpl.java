package com.gulmall.gulmember.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gulmall.common.service.impl.CrudServiceImpl;
import com.gulmall.gulmember.dao.SmsHomeAdvDao;
import com.gulmall.gulmember.dto.SmsHomeAdvDTO;
import com.gulmall.gulmember.entity.SmsHomeAdvEntity;
import com.gulmall.gulmember.service.SmsHomeAdvService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 首页轮播广告
 *
 * @author scorevictim GmailNotExist@gmail.com
 * @since 1.0.0 2022-09-16
 */
@Service
public class SmsHomeAdvServiceImpl extends CrudServiceImpl<SmsHomeAdvDao, SmsHomeAdvEntity, SmsHomeAdvDTO> implements SmsHomeAdvService {

    @Override
    public QueryWrapper<SmsHomeAdvEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<SmsHomeAdvEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}