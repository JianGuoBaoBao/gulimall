package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author jianguobaobao
 * @email jianguobaobao@gmail.com
 * @date 2023-08-29 22:25:56
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
