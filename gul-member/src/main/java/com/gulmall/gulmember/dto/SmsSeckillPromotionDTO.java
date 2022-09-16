package com.gulmall.gulmember.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;


/**
 * 秒杀活动
 *
 * @author scorevictim GmailNotExist@gmail.com
 * @since 1.0.0 2022-09-16
 */
@Data
@ApiModel(value = "秒杀活动")
public class SmsSeckillPromotionDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "id")
	private Long id;

	@ApiModelProperty(value = "活动标题")
	private String title;

	@ApiModelProperty(value = "开始日期")
	private Date startTime;

	@ApiModelProperty(value = "结束日期")
	private Date endTime;

	@ApiModelProperty(value = "上下线状态")
	private Integer status;

	@ApiModelProperty(value = "创建时间")
	private Date createTime;

	@ApiModelProperty(value = "创建人")
	private Long userId;


}