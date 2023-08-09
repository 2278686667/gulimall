package com.chb.gulimall.coupon.dao;

import com.chb.gulimall.coupon.entity.HomeSubjectEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 * 
 * @author chb
 * @email 
 * @date 2023-07-30 22:37:49
 */
@Mapper
public interface HomeSubjectDao extends BaseMapper<HomeSubjectEntity> {
	
}
