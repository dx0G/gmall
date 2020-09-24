package com.guodx.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guodx.gmall.common.utils.PageUtils;
import com.guodx.gmall.pms.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author guodx
 * @email guoxu0615@gmail.com
 * @date 2020-09-24 20:45:50
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

