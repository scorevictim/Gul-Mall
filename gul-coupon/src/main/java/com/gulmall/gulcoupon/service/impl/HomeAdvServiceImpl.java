package com.gulmall.gulcoupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gulmall.common.service.impl.CrudServiceImpl;
import com.gulmall.gulcoupon.dao.HomeAdvDao;
import com.gulmall.gulcoupon.dto.HomeAdvDTO;
import com.gulmall.gulcoupon.entity.HomeAdvEntity;
import com.gulmall.gulcoupon.service.HomeAdvService;
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
public class HomeAdvServiceImpl extends CrudServiceImpl<HomeAdvDao, HomeAdvEntity, HomeAdvDTO> implements HomeAdvService {

    @Override
    public QueryWrapper<HomeAdvEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<HomeAdvEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}