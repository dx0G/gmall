package com.guodx.gmall.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guodx.gmall.common.utils.PageUtils;
import com.guodx.gmall.wms.entity.WareOrderTaskEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author guodx
 * @email guoxu0615@gmail.com
 * @date 2020-09-24 20:43:17
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

