package com.gulmall.gulproduct.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 属性分组
 *
 * @author Scorevictim GmailNotExist@gmail.com
 * @since 1.0.0 2022-09-14
 */
@Data
@TableName("pms_attr_group")
public class AttrGroupEntity {

    /**
     * 分组id
     */
	private Long attrGroupId;
    /**
     * 组名
     */
	private String attrGroupName;
    /**
     * 排序
     */
	private Integer sort;
    /**
     * 描述
     */
	private String descript;
    /**
     * 组图标
     */
	private String icon;
    /**
     * 所属分类id
     */
	private Long catelogId;
}