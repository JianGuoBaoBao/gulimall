package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author jianguobaobao
 * @email jianguobaobao@gmail.com
 * @date 2023-09-02 11:44:36
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
