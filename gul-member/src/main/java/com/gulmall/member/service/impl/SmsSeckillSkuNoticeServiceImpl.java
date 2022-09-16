package com.gulmall.member.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gulmall.common.service.impl.CrudServiceImpl;
import com.gulmall.member.dao.SmsSeckillSkuNoticeDao;
import com.gulmall.member.dto.SmsSeckillSkuNoticeDTO;
import com.gulmall.member.entity.SmsSeckillSkuNoticeEntity;
import com.gulmall.member.service.SmsSeckillSkuNoticeService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 秒杀商品通知订阅
 *
 * @author scorevictim GmailNotExist@gmail.com
 * @since 1.0.0 2022-09-16
 */
@Service
public class SmsSeckillSkuNoticeServiceImpl extends CrudServiceImpl<SmsSeckillSkuNoticeDao, SmsSeckillSkuNoticeEntity, SmsSeckillSkuNoticeDTO> implements SmsSeckillSkuNoticeService {

    @Override
    public QueryWrapper<SmsSeckillSkuNoticeEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<SmsSeckillSkuNoticeEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}