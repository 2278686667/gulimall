package com.chb.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chb.gulimall.product.entity.AttrGroupEntity;
import com.chb.gulimallcommon.utils.PageUtils;

import java.util.Map;

/**
 * 属性分组
 *
 * @author chb
 * @email 
 * @date 2023-07-30 20:16:54
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

