package com.gulmall.gulware.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 库存工作单
 *
 * @author scorevictim GmailNotExist@gmail.com
 * @since 1.0.0 2022-09-16
 */
@Data
@TableName("wms_ware_order_task_detail")
public class WmsWareOrderTaskDetailEntity {

    /**
     * id
     */
	private Long id;
    /**
     * sku_id
     */
	private Long skuId;
    /**
     * sku_name
     */
	private String skuName;
    /**
     * 购买个数
     */
	private Integer skuNum;
    /**
     * 工作单id
     */
	private Long taskId;
}