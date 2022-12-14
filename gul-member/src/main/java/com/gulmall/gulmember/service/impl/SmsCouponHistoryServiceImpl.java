package com.gulmall.gulmember.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gulmall.common.service.impl.CrudServiceImpl;
import com.gulmall.gulmember.dao.SmsCouponHistoryDao;
import com.gulmall.gulmember.dto.SmsCouponHistoryDTO;
import com.gulmall.gulmember.entity.SmsCouponHistoryEntity;
import com.gulmall.gulmember.service.SmsCouponHistoryService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 优惠券领取历史记录
 *
 * @author scorevictim GmailNotExist@gmail.com
 * @since 1.0.0 2022-09-16
 */
@Service
public class SmsCouponHistoryServiceImpl extends CrudServiceImpl<SmsCouponHistoryDao, SmsCouponHistoryEntity, SmsCouponHistoryDTO> implements SmsCouponHistoryService {

    @Override
    public QueryWrapper<SmsCouponHistoryEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<SmsCouponHistoryEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}