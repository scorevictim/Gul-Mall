package com.gulmall.member.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gulmall.common.service.impl.CrudServiceImpl;
import com.gulmall.member.dao.SmsSeckillSessionDao;
import com.gulmall.member.dto.SmsSeckillSessionDTO;
import com.gulmall.member.entity.SmsSeckillSessionEntity;
import com.gulmall.member.service.SmsSeckillSessionService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 秒杀活动场次
 *
 * @author scorevictim GmailNotExist@gmail.com
 * @since 1.0.0 2022-09-16
 */
@Service
public class SmsSeckillSessionServiceImpl extends CrudServiceImpl<SmsSeckillSessionDao, SmsSeckillSessionEntity, SmsSeckillSessionDTO> implements SmsSeckillSessionService {

    @Override
    public QueryWrapper<SmsSeckillSessionEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<SmsSeckillSessionEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}