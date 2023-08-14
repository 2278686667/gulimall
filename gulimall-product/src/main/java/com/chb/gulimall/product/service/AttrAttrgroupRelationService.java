package com.chb.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chb.gulimall.product.entity.AttrAttrgroupRelationEntity;
import com.chb.gulimallcommon.utils.PageUtils;


import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author chb
 * @email 
 * @date 2023-07-30 20:16:56
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

