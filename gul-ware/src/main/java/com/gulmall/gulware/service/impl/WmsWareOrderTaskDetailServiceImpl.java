package com.gulmall.gulware.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gulmall.common.service.impl.CrudServiceImpl;
import com.gulmall.gulware.dao.WmsWareOrderTaskDetailDao;
import com.gulmall.gulware.dto.WmsWareOrderTaskDetailDTO;
import com.gulmall.gulware.entity.WmsWareOrderTaskDetailEntity;
import com.gulmall.gulware.service.WmsWareOrderTaskDetailService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author scorevictim GmailNotExist@gmail.com
 * @since 1.0.0 2022-09-16
 */
@Service
public class WmsWareOrderTaskDetailServiceImpl extends CrudServiceImpl<WmsWareOrderTaskDetailDao, WmsWareOrderTaskDetailEntity, WmsWareOrderTaskDetailDTO> implements WmsWareOrderTaskDetailService {

    @Override
    public QueryWrapper<WmsWareOrderTaskDetailEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<WmsWareOrderTaskDetailEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}