package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author jianguobaobao
 * @email jianguobaobao@gmail.com
 * @date 2023-09-02 12:24:38
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
