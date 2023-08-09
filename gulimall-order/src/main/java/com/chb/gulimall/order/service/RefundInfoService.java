package com.chb.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chb.gulimallcommon.utils.PageUtils;
import com.chb.gulimall.order.entity.RefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author chb
 * @email 
 * @date 2023-07-30 21:38:37
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

