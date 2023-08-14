package com.chb.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chb.gulimall.product.entity.BrandEntity;
import com.chb.gulimallcommon.utils.PageUtils;

import java.util.Map;

/**
 * 品牌
 *
 * @author chb
 * @email 
 * @date 2023-07-30 20:16:55
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

