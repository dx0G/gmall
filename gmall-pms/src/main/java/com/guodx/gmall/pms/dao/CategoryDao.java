package com.guodx.gmall.pms.dao;

import com.guodx.gmall.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author guodx
 * @email guoxu0615@gmail.com
 * @date 2020-09-24 20:45:50
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
