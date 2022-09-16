package com.gulmall.member.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gulmall.common.service.impl.CrudServiceImpl;
import com.gulmall.member.dao.SmsCouponSpuRelationDao;
import com.gulmall.member.dto.SmsCouponSpuRelationDTO;
import com.gulmall.member.entity.SmsCouponSpuRelationEntity;
import com.gulmall.member.service.SmsCouponSpuRelationService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 优惠券与产品关联
 *
 * @author scorevictim GmailNotExist@gmail.com
 * @since 1.0.0 2022-09-16
 */
@Service
public class SmsCouponSpuRelationServiceImpl extends CrudServiceImpl<SmsCouponSpuRelationDao, SmsCouponSpuRelationEntity, SmsCouponSpuRelationDTO> implements SmsCouponSpuRelationService {

    @Override
    public QueryWrapper<SmsCouponSpuRelationEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<SmsCouponSpuRelationEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}