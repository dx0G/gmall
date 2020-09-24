package com.guodx.gmall.oms.dao;

import com.guodx.gmall.oms.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author guodx
 * @email guoxu0615@gmail.com
 * @date 2020-09-24 21:18:05
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
