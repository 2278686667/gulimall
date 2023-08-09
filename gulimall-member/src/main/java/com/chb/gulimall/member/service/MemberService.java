package com.chb.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chb.gulimallcommon.utils.PageUtils;
import com.chb.gulimall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author chb
 * @email 
 * @date 2023-07-30 21:33:31
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

