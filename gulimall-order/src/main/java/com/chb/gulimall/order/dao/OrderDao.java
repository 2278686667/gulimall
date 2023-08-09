package com.chb.gulimall.order.dao;

import com.chb.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author chb
 * @email 
 * @date 2023-07-30 21:38:37
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
