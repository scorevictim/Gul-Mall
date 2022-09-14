package com.gulmall.gulproduct.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

import java.util.Date;

/**
 * spu信息介绍
 *
 * @author scorevictim GmailNotExist@gmail.com
 * @since 1.0.0 2022-09-14
 */
@Data
public class SpuInfoDescExcel {
    @Excel(name = "商品id")
    private Long spuId;
    @Excel(name = "商品介绍")
    private String decript;

}