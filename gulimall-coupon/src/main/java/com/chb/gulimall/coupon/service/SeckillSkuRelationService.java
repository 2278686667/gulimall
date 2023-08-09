package com.chb.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chb.gulimallcommon.utils.PageUtils;
import com.chb.gulimall.coupon.entity.SeckillSkuRelationEntity;

import java.util.Map;

/**
 * 秒杀活动商品关联
 *
 * @author chb
 * @email 
 * @date 2023-07-30 22:37:50
 */
public interface SeckillSkuRelationService extends IService<SeckillSkuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

