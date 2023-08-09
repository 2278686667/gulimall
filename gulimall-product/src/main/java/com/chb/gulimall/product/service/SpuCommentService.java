package com.chb.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chb.gulimall.product.entity.SpuCommentEntity;
import com.chb.gulimallcommon.utils.PageUtils;

import java.util.Map;

/**
 * 商品评价
 *
 * @author chb
 * @email 
 * @date 2023-07-30 20:16:56
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

