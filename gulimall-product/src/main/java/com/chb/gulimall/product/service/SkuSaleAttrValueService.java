package com.chb.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chb.gulimall.product.entity.SkuSaleAttrValueEntity;
import com.chb.gulimallcommon.utils.PageUtils;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author chb
 * @email 
 * @date 2023-07-30 20:16:55
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

