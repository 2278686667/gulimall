package com.chb.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chb.gulimallcommon.utils.PageUtils;
import com.chb.gulimall.coupon.entity.CouponHistoryEntity;

import java.util.Map;

/**
 * 优惠券领取历史记录
 *
 * @author chb
 * @email 
 * @date 2023-07-30 22:37:49
 */
public interface CouponHistoryService extends IService<CouponHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

