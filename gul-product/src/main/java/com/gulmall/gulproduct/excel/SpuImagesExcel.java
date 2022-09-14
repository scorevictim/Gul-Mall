package com.gulmall.gulproduct.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

import java.util.Date;

/**
 * spu图片
 *
 * @author scorevictim GmailNotExist@gmail.com
 * @since 1.0.0 2022-09-14
 */
@Data
public class SpuImagesExcel {
    @Excel(name = "id")
    private Long id;
    @Excel(name = "spu_id")
    private Long spuId;
    @Excel(name = "图片名")
    private String imgName;
    @Excel(name = "图片地址")
    private String imgUrl;
    @Excel(name = "顺序")
    private Integer imgSort;
    @Excel(name = "是否默认图")
    private Integer defaultImg;

}