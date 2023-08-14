package com.chb.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chb.gulimall.product.entity.SkuImagesEntity;
import com.chb.gulimallcommon.utils.PageUtils;

import java.util.Map;

/**
 * sku图片
 *
 * @author chb
 * @email 
 * @date 2023-07-30 20:16:55
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

