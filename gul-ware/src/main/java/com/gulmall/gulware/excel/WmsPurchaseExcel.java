package com.gulmall.gulware.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 采购信息
 *
 * @author scorevictim GmailNotExist@gmail.com
 * @since 1.0.0 2022-09-16
 */
@Data
public class WmsPurchaseExcel {
    @Excel(name = "采购单id")
    private Long id;
    @Excel(name = "采购人id")
    private Long assigneeId;
    @Excel(name = "采购人名")
    private String assigneeName;
    @Excel(name = "联系方式")
    private String phone;
    @Excel(name = "优先级")
    private Integer priority;
    @Excel(name = "状态")
    private Integer status;
    @Excel(name = "仓库id")
    private Long wareId;
    @Excel(name = "总金额")
    private BigDecimal amount;
    @Excel(name = "创建日期")
    private Date createTime;
    @Excel(name = "更新日期")
    private Date updateTime;

}