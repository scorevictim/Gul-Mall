package com.gulmall.member.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gulmall.common.service.impl.CrudServiceImpl;
import com.gulmall.member.dao.SmsMemberPriceDao;
import com.gulmall.member.dto.SmsMemberPriceDTO;
import com.gulmall.member.entity.SmsMemberPriceEntity;
import com.gulmall.member.service.SmsMemberPriceService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 商品会员价格
 *
 * @author scorevictim GmailNotExist@gmail.com
 * @since 1.0.0 2022-09-16
 */
@Service
public class SmsMemberPriceServiceImpl extends CrudServiceImpl<SmsMemberPriceDao, SmsMemberPriceEntity, SmsMemberPriceDTO> implements SmsMemberPriceService {

    @Override
    public QueryWrapper<SmsMemberPriceEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<SmsMemberPriceEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}