package com.chb.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chb.gulimall.product.entity.CategoryEntity;
import com.chb.gulimallcommon.utils.PageUtils;
import com.chb.gulimallcommon.utils.R;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author chb
 * @email 
 * @date 2023-07-30 20:16:55
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<CategoryEntity> listWithTree();

    R removeMenuByIds(List<Long> list);
}

