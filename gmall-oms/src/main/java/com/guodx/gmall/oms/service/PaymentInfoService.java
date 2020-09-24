package com.guodx.gmall.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guodx.gmall.common.utils.PageUtils;
import com.guodx.gmall.oms.entity.PaymentInfoEntity;

import java.util.Map;

/**
 * 支付信息表
 *
 * @author guodx
 * @email guoxu0615@gmail.com
 * @date 2020-09-24 21:18:04
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

