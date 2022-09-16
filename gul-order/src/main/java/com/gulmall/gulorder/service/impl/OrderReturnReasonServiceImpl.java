package com.gulmall.gulorder.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gulmall.common.service.impl.CrudServiceImpl;
import com.gulmall.gulorder.dao.OrderReturnReasonDao;
import com.gulmall.gulorder.dto.OrderReturnReasonDTO;
import com.gulmall.gulorder.entity.OrderReturnReasonEntity;
import com.gulmall.gulorder.service.OrderReturnReasonService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 退货原因
 *
 * @author scorevictim GmailNotExist@gmail.com
 * @since 1.0.0 2022-09-16
 */
@Service
public class OrderReturnReasonServiceImpl extends CrudServiceImpl<OrderReturnReasonDao, OrderReturnReasonEntity, OrderReturnReasonDTO> implements OrderReturnReasonService {

    @Override
    public QueryWrapper<OrderReturnReasonEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<OrderReturnReasonEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}