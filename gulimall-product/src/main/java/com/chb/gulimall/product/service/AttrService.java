package com.chb.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chb.gulimall.product.entity.AttrEntity;
import com.chb.gulimallcommon.utils.PageUtils;

import java.util.Map;

/**
 * 商品属性
 *
 * @author chb
 * @email 
 * @date 2023-07-30 20:16:56
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

