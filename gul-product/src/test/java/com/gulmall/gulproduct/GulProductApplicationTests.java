package com.gulmall.gulproduct;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gulmall.gulproduct.entity.BrandEntity;
import com.gulmall.gulproduct.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulProductApplicationTests {

    @Autowired
    BrandService brandService;
    @Test
    void contextLoads() {

        BrandEntity brandEntity = new BrandEntity();

        brandEntity.setDescript("haha");
        brandEntity.setName("Huawei");
        brandService.save(brandEntity);
        System.out.println(brandEntity.getName());


    }

}
