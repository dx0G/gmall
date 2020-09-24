package com.guodx.gmall.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guodx.gmall.common.utils.PageUtils;
import com.guodx.gmall.wms.entity.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author guodx
 * @email guoxu0615@gmail.com
 * @date 2020-09-24 20:43:17
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

