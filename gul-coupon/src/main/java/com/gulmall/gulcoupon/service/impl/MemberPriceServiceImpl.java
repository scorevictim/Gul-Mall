package com.gulmall.gulcoupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gulmall.common.service.impl.CrudServiceImpl;
import com.gulmall.gulcoupon.dao.MemberPriceDao;
import com.gulmall.gulcoupon.dto.MemberPriceDTO;
import com.gulmall.gulcoupon.entity.MemberPriceEntity;
import com.gulmall.gulcoupon.service.MemberPriceService;
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
public class MemberPriceServiceImpl extends CrudServiceImpl<MemberPriceDao, MemberPriceEntity, MemberPriceDTO> implements MemberPriceService {

    @Override
    public QueryWrapper<MemberPriceEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<MemberPriceEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}