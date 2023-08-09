package com.chb.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chb.gulimall.product.entity.SpuInfoEntity;
import com.chb.gulimallcommon.utils.PageUtils;

import java.util.Map;

/**
 * spu信息
 *
 * @author chb
 * @email 
 * @date 2023-07-30 20:16:56
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

