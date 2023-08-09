package com.chb.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chb.gulimall.product.entity.CommentReplayEntity;
import com.chb.gulimallcommon.utils.PageUtils;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author chb
 * @email 
 * @date 2023-07-30 20:16:55
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

