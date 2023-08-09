package com.chb.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chb.gulimall.product.entity.SpuImagesEntity;
import com.chb.gulimallcommon.utils.PageUtils;

import java.util.Map;

/**
 * spu图片
 *
 * @author chb
 * @email 
 * @date 2023-07-30 20:16:56
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

