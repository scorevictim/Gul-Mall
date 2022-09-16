package com.gulmall.gulware.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gulmall.common.service.impl.CrudServiceImpl;
import com.gulmall.gulware.dao.WmsPurchaseDetailDao;
import com.gulmall.gulware.dto.WmsPurchaseDetailDTO;
import com.gulmall.gulware.entity.WmsPurchaseDetailEntity;
import com.gulmall.gulware.service.WmsPurchaseDetailService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 
 *
 * @author scorevictim GmailNotExist@gmail.com
 * @since 1.0.0 2022-09-16
 */
@Service
public class WmsPurchaseDetailServiceImpl extends CrudServiceImpl<WmsPurchaseDetailDao, WmsPurchaseDetailEntity, WmsPurchaseDetailDTO> implements WmsPurchaseDetailService {

    @Override
    public QueryWrapper<WmsPurchaseDetailEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<WmsPurchaseDetailEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}