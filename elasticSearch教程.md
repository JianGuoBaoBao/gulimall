### ElasticSearch概念—倒排索引
分词： 将整句分拆为单词

#### 全文检索数据
docker pull elasticsearch:7.4.2 存储和检索数据
docker pull kibana:7.4.2 可视化检索数据

### 镜像容器地址
[root@localhost containers]# pwd
/var/lib/docker/containers
[root@localhost containers]#

### 临时关闭防火墙
[root@localhost containers]# systemctl disable firewalld

## nacos&chrome跨域
open -n /Applications/Google\ Chrome.app/ --args --disable-web-security --user-data-dir=/Users/wanglingjie/IdeaProjects/tzbank_project/chromeDevData
sudo sh /Users/wanglingjie/work/nacos/nacos/bin/startup.sh -m standalone

### 实例创建
1、ElasticSearch 

mkdir -p /mydata/elasticsearch/config
mkdir -p /mydata/elasticsearch/data
echo "http.host:0.0.0.0">>/mydata/elasticsearch/config/elasticsearch.yml

docker run --name elasticsearch -p 9200:9200 -p 9300:9300 \
-e "discovery.type=single-node" \
-e ES_JAVA_OPTS="-Xms512m -Xmx1g" \
-v /mydata/elasticsearch/config/elasticsearch.yml:/usr/share/elasticsearch/config/elasticsearch.yml \
-v /mydata/elasticsearch/data:/usr/share/elasticsearch/data \
-v /mydata/elasticsearch/plugins:/usr/share/elasticsearch/plugins \
-d elasticsearch:7.4.2


### Kibana
docker run --name kibana -e ELASTICSEARCH_HOSTS=http://192.168.240.138:9200 -p 5601:5601 -d kibana:7.4.2

### Query DSL
基本语法格式
Elasticsearch 提供了一个可以执行查询的Json风格的DSL (domain-specific language领域特定语言)。
这个被称为Query DSL
```
GET bank/_search
{
  "query":{
    "match_all":{}
  },
  "sort": [
      {
        "account_number":"asc"
      },
      {
        "balance": "desc"
      }
    ]
}

```

```
GET bank/_search

{
  "query":{
    "match_all":{}
  },
  "sort": [
      {
        "balance": {
          "order":"desc"
        }
      }
    ],
    "from":0,
    "size":5
}

```

### nginx
docker run -p 80:80 --name nginx -d nginx:1.10
docker container cp nginx:/etc/nginx .

docker run -p 80:80 --name nginx \
-v /mydata/nginx/html:/usr/share/nginx/html \
-v /mydata/nginx/logs:/var/log/nginx \
-v /mydata/nginx/conf:/etc/nginx \
-d nginx:1.10
