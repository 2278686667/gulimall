package com.chb.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chb.gulimall.product.entity.CategoryBrandRelationEntity;
import com.chb.gulimallcommon.utils.PageUtils;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author chb
 * @email 
 * @date 2023-07-30 20:16:55
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

