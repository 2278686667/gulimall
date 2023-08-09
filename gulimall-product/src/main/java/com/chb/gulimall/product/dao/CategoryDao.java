package com.chb.gulimall.product.dao;

import com.chb.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author chb
 * @email 
 * @date 2023-07-30 20:16:55
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
