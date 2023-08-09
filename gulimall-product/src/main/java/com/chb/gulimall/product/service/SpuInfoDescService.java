package com.chb.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chb.gulimall.product.entity.SpuInfoDescEntity;
import com.chb.gulimallcommon.utils.PageUtils;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author chb
 * @email 
 * @date 2023-07-30 20:16:56
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

