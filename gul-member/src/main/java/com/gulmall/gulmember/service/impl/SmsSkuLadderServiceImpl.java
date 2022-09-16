package com.gulmall.gulmember.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gulmall.common.service.impl.CrudServiceImpl;
import com.gulmall.gulmember.dao.SmsSkuLadderDao;
import com.gulmall.gulmember.dto.SmsSkuLadderDTO;
import com.gulmall.gulmember.entity.SmsSkuLadderEntity;
import com.gulmall.gulmember.service.SmsSkuLadderService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 
 *
 * @author scorevictim GmailNotExist@gmail.com
 * @since 1.0.0 2022-09-16
 */
@Service
public class SmsSkuLadderServiceImpl extends CrudServiceImpl<SmsSkuLadderDao, SmsSkuLadderEntity, SmsSkuLadderDTO> implements SmsSkuLadderService {

    @Override
    public QueryWrapper<SmsSkuLadderEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<SmsSkuLadderEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}