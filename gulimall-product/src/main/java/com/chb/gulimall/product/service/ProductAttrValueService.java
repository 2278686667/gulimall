package com.chb.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chb.gulimall.product.entity.ProductAttrValueEntity;
import com.chb.gulimallcommon.utils.PageUtils;

import java.util.Map;

/**
 * spu属性值
 *
 * @author chb
 * @email 
 * @date 2023-07-30 20:16:55
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

