package com.atguigu.gulimall.product;

//import com.aliyun.oss.*;
//import com.aliyun.oss.common.auth.CredentialsProviderFactory;
//import com.aliyun.oss.common.auth.EnvironmentVariableCredentialsProvider;
//import com.aliyun.oss.model.OSSObject;
import com.atguigu.gulimall.product.entity.BrandEntity;
import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.atguigu.gulimall.product.service.BrandService;
import com.atguigu.gulimall.product.service.CategoryService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.*;
import java.util.List;


/**
 * 1、引入oss-starter
 * 2、配置key，endpoint相关信息即可
 * 3、使用OSSClient 进行相关操作
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;

//    @Autowired
//    OSSClient ossClient;


    @Autowired
    CategoryService categoryService;



    @Test
    public void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setName("华为");
//        brandService.save(brandEntity);

//
//        brandEntity.setBrandId(1L);
//        brandEntity.setDescript("华为");
//        brandService.updateById(brandEntity);


        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
//        list.forEach(ITEM ->{
//            System.out.println(ITEM);
//        });
        list.forEach(System.out::println);
    }

//    @Test
//    public void tesstUploat() throws FileNotFoundException {
//
//        InputStream inputStream =  new FileInputStream("/Users/wanglingjie/IdeaProjects/web_learn/java/gulimall/gulimall-product/src/test/java/com/atguigu/gulimall/product/temp.txt");
//        ossClient.putObject("jianguobaobao01", "temp.txt", inputStream);
//
//        ossClient.shutdown();
//        System.out.println("上传完成");
//
//    }
}
