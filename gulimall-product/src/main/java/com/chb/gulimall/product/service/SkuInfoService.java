package com.chb.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chb.gulimall.product.entity.SkuInfoEntity;
import com.chb.gulimallcommon.utils.PageUtils;

import java.util.Map;

/**
 * sku信息
 *
 * @author chb
 * @email 
 * @date 2023-07-30 20:16:55
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

