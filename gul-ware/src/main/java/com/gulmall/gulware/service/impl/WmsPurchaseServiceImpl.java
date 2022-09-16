package com.gulmall.gulware.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gulmall.common.service.impl.CrudServiceImpl;
import com.gulmall.gulware.dao.WmsPurchaseDao;
import com.gulmall.gulware.dto.WmsPurchaseDTO;
import com.gulmall.gulware.entity.WmsPurchaseEntity;
import com.gulmall.gulware.service.WmsPurchaseService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 采购信息
 *
 * @author scorevictim GmailNotExist@gmail.com
 * @since 1.0.0 2022-09-16
 */
@Service
public class WmsPurchaseServiceImpl extends CrudServiceImpl<WmsPurchaseDao, WmsPurchaseEntity, WmsPurchaseDTO> implements WmsPurchaseService {

    @Override
    public QueryWrapper<WmsPurchaseEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<WmsPurchaseEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}