package com.gulmall.gulmember.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gulmall.common.service.impl.CrudServiceImpl;
import com.gulmall.gulmember.dao.SmsSkuFullReductionDao;
import com.gulmall.gulmember.dto.SmsSkuFullReductionDTO;
import com.gulmall.gulmember.entity.SmsSkuFullReductionEntity;
import com.gulmall.gulmember.service.SmsSkuFullReductionService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author scorevictim GmailNotExist@gmail.com
 * @since 1.0.0 2022-09-16
 */
@Service
public class SmsSkuFullReductionServiceImpl extends CrudServiceImpl<SmsSkuFullReductionDao, SmsSkuFullReductionEntity, SmsSkuFullReductionDTO> implements SmsSkuFullReductionService {

    @Override
    public QueryWrapper<SmsSkuFullReductionEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<SmsSkuFullReductionEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}