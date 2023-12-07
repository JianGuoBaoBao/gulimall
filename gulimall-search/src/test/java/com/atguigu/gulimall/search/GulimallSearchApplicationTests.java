package com.atguigu.gulimall.search;

import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.rest.action.cat.RestHealthAction;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.SQLOutput;

@RunWith(SpringRunner.class)
@SpringBootTest
class GulimallSearchApplicationTests {

    @Autowired
    private RestHighLevelClient client;

    /**
     * 测试存储数据到es
     */
    @Test
    public void indexData() {
        
    }

    @Test
    public void contextLoads() {
        System.out.println(client);
    }

}
