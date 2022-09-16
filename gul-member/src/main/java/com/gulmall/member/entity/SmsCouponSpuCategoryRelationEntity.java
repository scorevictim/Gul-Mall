package com.gulmall.member.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 优惠券分类关联
 *
 * @author scorevictim GmailNotExist@gmail.com
 * @since 1.0.0 2022-09-16
 */
@Data
@TableName("sms_coupon_spu_category_relation")
public class SmsCouponSpuCategoryRelationEntity {

    /**
     * id
     */
	private Long id;
    /**
     * 优惠券id
     */
	private Long couponId;
    /**
     * 产品分类id
     */
	private Long categoryId;
    /**
     * 产品分类名称
     */
	private String categoryName;
}