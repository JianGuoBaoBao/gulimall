package com.atguigu.gulimall.search.config;

import org.apache.http.HttpHost;
import org.elasticsearch.client.Request;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestClientBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 1. 导入依赖
 * 2. 编写配置, 给容器中注入一个RestHighLevelClient
 * 3。
 */
@Configuration
public class GuilimallElasticSearchConfig {

//    @Autowired
//    private RestHighLevelClient client;

    private static final RequestOptions COMMON_OPTIONS;
    static {
        RequestOptions.Builder builder = RequestOptions.DEFAULT.toBuilder();
    }


    @Bean
    public RestHighLevelClient esRestClient(){

        RestClientBuilder builder = null;
        builder = RestClient.builder(new HttpHost("192.168.136.128", 9200, "http"));

        RestHighLevelClient client = new RestHighLevelClient(builder);
        // RestHighLevelClient client = new RestHighLevelClient(
        // RestClient.builder(
        // new HttpHost("192.168.136.128", 9200,"http")));

        return client;
    }

}