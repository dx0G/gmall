package com.guodx.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guodx.gmall.common.utils.PageUtils;
import com.guodx.gmall.ums.entity.MemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 *
 * @author guodx
 * @email guoxu0615@gmail.com
 * @date 2020-09-24 20:52:59
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

