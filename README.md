# gulimall
谷粒商场

###微服务-注册中心、配置中心、网关
admin-vue  -> API网关

springCloud Alibaba
SpringCloud Alibaba-Nacos: 注册中心（服务发现/注册）
SpringCloud Alibaba-Nacos: 配置中心（动态配置管理）

SpringCloud-Ribbon: 负载均衡
SpringCloud-Feign: 声明式HTTP客户端（调用远程服务）
SpringCloudAlibaba-Sentinel: 服务容错（限流、降级、熔断）  保护服务的稳定性
SpringCloud-Gateway: API网关（webflux编程模式）
SpringCloud-Sleuth: 调用链监控
SpringCloudAlibaba-Seata： 原Fescar, 即分布事物解决方案


![阿里cloud](https://github.com/alibaba/spring-cloud-alibaba/blob/2.2.x/README-zh.md])
![nacos-server下载](https://github.com/alibaba/nacos/releases/tag/1.1.3)
![Nacos](https://nacos.io/zh-cn/docs/what-is-nacos.html)



###跨域
> 不是简单请求需要发送域前请求：OPTIONS 找服务器，服务器允不允许访问。真实服务就不再发送。之后在是复杂请求。
> 1/ 使用nginx   线上
> 2/ 本地开发 直接运行跨域访问就行了。 具体在springCloud中 getWay中统一配置跨域


### 数据库设置固定ip访问
```
    flush privileges;
    GRANT ALL PRIVILEGES ON *.* TO 'root'@'能访问的ip' IDENTIFIED BY 'root的密码' WITH GRANT OPTION;
    flush privileges;
```


### 常规报错解析
```
    ***************************
    APPLICATION FAILED TO START
    ***************************
    
    Description:
    
    Field ossClient in com.atguigu.gulimall.thirdparty.controller.OssController required a bean of type 'com.aliyun.oss.OSSClient' that could not be found.
    
    The injection point has the following annotations:
    	- @org.springframework.beans.factory.annotation.Autowired(required=true)

```

bean没有找到，查找spring starter启动项目都是有自动配置的，查看xxxAutoConfiguration源文件可以看到


### 204 No Content


