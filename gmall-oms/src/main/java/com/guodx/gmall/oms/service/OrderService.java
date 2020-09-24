package com.guodx.gmall.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guodx.gmall.common.utils.PageUtils;
import com.guodx.gmall.oms.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author guodx
 * @email guoxu0615@gmail.com
 * @date 2020-09-24 21:18:05
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

