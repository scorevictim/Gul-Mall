package com.gulmall.gulproduct.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;


/**
 * spu信息介绍
 *
 * @author scorevictim GmailNotExist@gmail.com
 * @since 1.0.0 2022-09-14
 */
@Data
@ApiModel(value = "spu信息介绍")
public class SpuInfoDescDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "商品id")
	private Long spuId;

	@ApiModelProperty(value = "商品介绍")
	private String decript;


}