package com.chb.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chb.gulimallcommon.utils.PageUtils;
import com.chb.gulimall.member.entity.MemberLoginLogEntity;

import java.util.Map;

/**
 * 会员登录记录
 *
 * @author chb
 * @email 
 * @date 2023-07-30 21:33:30
 */
public interface MemberLoginLogService extends IService<MemberLoginLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

