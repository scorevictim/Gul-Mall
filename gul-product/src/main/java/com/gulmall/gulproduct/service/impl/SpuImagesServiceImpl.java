package com.gulmall.gulproduct.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gulmall.common.service.impl.CrudServiceImpl;
import com.gulmall.gulproduct.dao.SpuImagesDao;
import com.gulmall.gulproduct.dto.SpuImagesDTO;
import com.gulmall.gulproduct.entity.SpuImagesEntity;
import com.gulmall.gulproduct.service.SpuImagesService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * spu图片
 *
 * @author scorevictim GmailNotExist@gmail.com
 * @since 1.0.0 2022-09-14
 */
@Service
public class SpuImagesServiceImpl extends CrudServiceImpl<SpuImagesDao, SpuImagesEntity, SpuImagesDTO> implements SpuImagesService {

    @Override
    public QueryWrapper<SpuImagesEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<SpuImagesEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}