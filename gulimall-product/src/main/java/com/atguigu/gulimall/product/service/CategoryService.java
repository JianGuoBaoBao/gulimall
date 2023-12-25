package com.atguigu.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author jianguobaobao
 * @email jianguobaobao@gmail.com
 * @date 2023-08-29 22:25:56
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<CategoryEntity> listWithTree();

    void removeMenuByIds(List<Long> asList);


    /**
     * 找到catelogId
     * [父/子/孙]
     * @param catlogId
     * @return
     */
    Long[] findCatelogPath(Long catlogId);

    void updateCascade(CategoryEntity category);

    List<CategoryEntity> getLevel1Categorys();
}

