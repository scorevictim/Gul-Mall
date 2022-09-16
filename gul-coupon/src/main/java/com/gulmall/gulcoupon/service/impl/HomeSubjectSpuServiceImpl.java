package com.gulmall.gulcoupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gulmall.common.service.impl.CrudServiceImpl;
import com.gulmall.gulcoupon.dao.HomeSubjectSpuDao;
import com.gulmall.gulcoupon.dto.HomeSubjectSpuDTO;
import com.gulmall.gulcoupon.entity.HomeSubjectSpuEntity;
import com.gulmall.gulcoupon.service.HomeSubjectSpuService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 专题商品
 *
 * @author scorevictim GmailNotExist@gmail.com
 * @since 1.0.0 2022-09-16
 */
@Service
public class HomeSubjectSpuServiceImpl extends CrudServiceImpl<HomeSubjectSpuDao, HomeSubjectSpuEntity, HomeSubjectSpuDTO> implements HomeSubjectSpuService {

    @Override
    public QueryWrapper<HomeSubjectSpuEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<HomeSubjectSpuEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}