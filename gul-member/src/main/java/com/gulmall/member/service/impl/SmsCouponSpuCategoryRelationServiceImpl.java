package com.gulmall.member.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gulmall.common.service.impl.CrudServiceImpl;
import com.gulmall.member.dao.SmsCouponSpuCategoryRelationDao;
import com.gulmall.member.dto.SmsCouponSpuCategoryRelationDTO;
import com.gulmall.member.entity.SmsCouponSpuCategoryRelationEntity;
import com.gulmall.member.service.SmsCouponSpuCategoryRelationService;
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
public class SmsCouponSpuCategoryRelationServiceImpl extends CrudServiceImpl<SmsCouponSpuCategoryRelationDao, SmsCouponSpuCategoryRelationEntity, SmsCouponSpuCategoryRelationDTO> implements SmsCouponSpuCategoryRelationService {

    @Override
    public QueryWrapper<SmsCouponSpuCategoryRelationEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<SmsCouponSpuCategoryRelationEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}