package com.gulmall.member.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

import java.math.BigDecimal;

/**
 * 商品满减信息
 *
 * @author scorevictim GmailNotExist@gmail.com
 * @since 1.0.0 2022-09-16
 */
@Data
@ApiModel(value = "商品满减信息")
public class SmsSkuFullReductionDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "id")
	private Long id;

	@ApiModelProperty(value = "spu_id")
	private Long skuId;

	@ApiModelProperty(value = "满多少")
	private BigDecimal fullPrice;

	@ApiModelProperty(value = "减多少")
	private BigDecimal reducePrice;

	@ApiModelProperty(value = "是否参与其他优惠")
	private Integer addOther;


}