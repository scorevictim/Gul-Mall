package com.gulmall.gulmember.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gulmall.common.service.impl.CrudServiceImpl;
import com.gulmall.gulmember.dao.SmsCouponDao;
import com.gulmall.gulmember.dto.SmsCouponDTO;
import com.gulmall.gulmember.entity.SmsCouponEntity;
import com.gulmall.gulmember.service.SmsCouponService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author scorevictim GmailNotExist@gmail.com
 * @since 1.0.0 2022-09-16
 */
@Service
public class SmsCouponServiceImpl extends CrudServiceImpl<SmsCouponDao, SmsCouponEntity, SmsCouponDTO> implements SmsCouponService {

    @Override
    public QueryWrapper<SmsCouponEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<SmsCouponEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}