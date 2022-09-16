package com.gulmall.gulcoupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gulmall.common.service.impl.CrudServiceImpl;
import com.gulmall.gulcoupon.dao.CouponSpuCategoryRelationDao;
import com.gulmall.gulcoupon.dto.CouponSpuCategoryRelationDTO;
import com.gulmall.gulcoupon.entity.CouponSpuCategoryRelationEntity;
import com.gulmall.gulcoupon.service.CouponSpuCategoryRelationService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 优惠券分类关联
 *
 * @author scorevictim GmailNotExist@gmail.com
 * @since 1.0.0 2022-09-16
 */
@Service
public class CouponSpuCategoryRelationServiceImpl extends CrudServiceImpl<CouponSpuCategoryRelationDao, CouponSpuCategoryRelationEntity, CouponSpuCategoryRelationDTO> implements CouponSpuCategoryRelationService {

    @Override
    public QueryWrapper<CouponSpuCategoryRelationEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<CouponSpuCategoryRelationEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}