package com.gulmall.gulware.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gulmall.common.service.impl.CrudServiceImpl;
import com.gulmall.gulware.dao.WmsWareSkuDao;
import com.gulmall.gulware.dto.WmsWareSkuDTO;
import com.gulmall.gulware.entity.WmsWareSkuEntity;
import com.gulmall.gulware.service.WmsWareSkuService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 商品库存
 *
 * @author scorevictim GmailNotExist@gmail.com
 * @since 1.0.0 2022-09-16
 */
@Service
public class WmsWareSkuServiceImpl extends CrudServiceImpl<WmsWareSkuDao, WmsWareSkuEntity, WmsWareSkuDTO> implements WmsWareSkuService {

    @Override
    public QueryWrapper<WmsWareSkuEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<WmsWareSkuEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}