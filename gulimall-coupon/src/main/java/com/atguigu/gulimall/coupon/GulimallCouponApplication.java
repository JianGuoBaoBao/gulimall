package com.atguigu.gulimall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * 1.如何使用Nacos作为配置中心统一管理配置
 *  1）引入依赖。
 *         <dependency>
 *             <groupId>com.alibaba.cloud</groupId>
 *             <artifactId>spring-cloud-starter-alibaba-nacos-config</artifactId>
 *         </dependency>
 *  2)创建一个bootstrap.properties
 *      spring.application.name = gulimall-coupon
 *      spring.cloud.nacos.config.server-addr=127.0.0.1:8848
 *  3)需要给配置中心默认添加一个叫DataId: 数据集    默认名字： gulimall-coupon.properties  (应用名.properties)
 *  4)给应用名.properties 添加任何配置
 *  5)动态获取配置
 *      @RefreshScope :动态获取并刷新配置
 *      @Value("${配置项的名}")： 获取到配置
 *      如果配置中心和当前应用配置都配置了相同的项，优先使用配置中心的配置
 *
 * 2、细节
 *    1）、命名空间 ： 默认是public: 默认新增的所有配置都在public空间。
 *      1、开发，测试，生产：利用命名空间还做环境隔离
 *          注意：在bootstrap.properties：配置上，需要使用哪个命名空间下的配置：spring.cloud.nacos.config.namespace：
 *          8e982140-5cda-4b9b-832c-4b2102a0e0ea
 *      2、每个微服务之间相互隔离配置，每一个微服务都创建爱你自己的命名空间，只加载自己命名空间下的所有配置
 *
 *
 *     2）、配置集：所有配置的集合
 *
 *     3）、配置集ID：类似文件名。
 *         Data ID：文件名。
 *
 *     4)、配置分组
 *        默认所有的配置集都属于： DEFAULT_GROUP;
 *        dev/prod/sit/uat
 *
 *      每个微服务创建自己的命名空间，使用配置分组区分环境，dev prop环境
 *
 * 3.同时加载多个配置集
 *  1）、微服务任何配置信息，任何配置文件都可以放在配置中心中
 *  2）、只需要在bootstrap.properties说明加载配置中心中哪些配置文件即可
 *  3）、@Value, @ConfigurationProperties...
 *
 *  以前SpringBoot任何方法都从配置文件中获取值，配置中心有的优先使用配置中心
 *
 */
@EnableDiscoveryClient
@SpringBootApplication
public class GulimallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallCouponApplication.class, args);
    }

}
