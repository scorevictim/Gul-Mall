package com.gulmall.gulmember.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gulmall.common.service.impl.CrudServiceImpl;
import com.gulmall.gulmember.dao.SmsSeckillSkuRelationDao;
import com.gulmall.gulmember.dto.SmsSeckillSkuRelationDTO;
import com.gulmall.gulmember.entity.SmsSeckillSkuRelationEntity;
import com.gulmall.gulmember.service.SmsSeckillSkuRelationService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 秒杀活动商品关联
 *
 * @author scorevictim GmailNotExist@gmail.com
 * @since 1.0.0 2022-09-16
 */
@Service
public class SmsSeckillSkuRelationServiceImpl extends CrudServiceImpl<SmsSeckillSkuRelationDao, SmsSeckillSkuRelationEntity, SmsSeckillSkuRelationDTO> implements SmsSeckillSkuRelationService {

    @Override
    public QueryWrapper<SmsSeckillSkuRelationEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<SmsSeckillSkuRelationEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}