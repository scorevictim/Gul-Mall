package com.gulmall.gulmember.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gulmall.common.service.impl.CrudServiceImpl;
import com.gulmall.gulmember.dao.SmsSeckillPromotionDao;
import com.gulmall.gulmember.dto.SmsSeckillPromotionDTO;
import com.gulmall.gulmember.entity.SmsSeckillPromotionEntity;
import com.gulmall.gulmember.service.SmsSeckillPromotionService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 秒杀活动
 *
 * @author scorevictim GmailNotExist@gmail.com
 * @since 1.0.0 2022-09-16
 */
@Service
public class SmsSeckillPromotionServiceImpl extends CrudServiceImpl<SmsSeckillPromotionDao, SmsSeckillPromotionEntity, SmsSeckillPromotionDTO> implements SmsSeckillPromotionService {

    @Override
    public QueryWrapper<SmsSeckillPromotionEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<SmsSeckillPromotionEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}