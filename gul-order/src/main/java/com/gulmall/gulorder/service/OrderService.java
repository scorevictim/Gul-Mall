package com.gulmall.gulorder.service;

import com.gulmall.common.service.CrudService;
import com.gulmall.gulorder.dto.OrderDTO;
import com.gulmall.gulorder.entity.OrderEntity;

/**
 * 订单
 *
 * @author scorevictim GmailNotExist@gmail.com
 * @since 1.0.0 2022-09-16
 */
public interface OrderService extends CrudService<OrderEntity, OrderDTO> {

}