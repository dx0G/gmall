package com.guodx.gmall.sms.dao;

import com.guodx.gmall.sms.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author guodx
 * @email guoxu0615@gmail.com
 * @date 2020-09-24 21:11:07
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
