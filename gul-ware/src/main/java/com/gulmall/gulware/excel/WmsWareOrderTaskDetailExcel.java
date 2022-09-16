package com.gulmall.gulware.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

import java.util.Date;

/**
 * 库存工作单
 *
 * @author scorevictim GmailNotExist@gmail.com
 * @since 1.0.0 2022-09-16
 */
@Data
public class WmsWareOrderTaskDetailExcel {
    @Excel(name = "id")
    private Long id;
    @Excel(name = "sku_id")
    private Long skuId;
    @Excel(name = "sku_name")
    private String skuName;
    @Excel(name = "购买个数")
    private Integer skuNum;
    @Excel(name = "工作单id")
    private Long taskId;

}