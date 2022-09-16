package com.gulmall.gulmember.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 
 *
 * @author scorevictim GmailNotExist@gmail.com
 * @since 1.0.0 2022-09-16
 */
@Data
public class SmsSkuLadderExcel {
    @Excel(name = "id")
    private Long id;
    @Excel(name = "spu_id")
    private Long skuId;
    @Excel(name = "满几件")
    private Integer fullCount;
    @Excel(name = "打几折")
    private BigDecimal discount;
    @Excel(name = "折后价")
    private BigDecimal price;
    @Excel(name = "是否叠加其他优惠[0-不可叠加，1-可叠加]")
    private Integer addOther;

}