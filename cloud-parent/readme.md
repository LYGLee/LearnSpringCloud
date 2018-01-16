
# 工具
maven项目管理  git代码管理
#开发规范
内部服务接口url 必须包含/service/
外部api接口url 必须不包含/service/
# 技术点
* springboot 
* springcloud
### 使用eureka作为注册中心
访问  http://localhost:8761/ 查看注册中心界面
[注册中心详细](notes/eureka.md)

### 2018.1.15 增加Actuator
使用  http://{ip}:{port}/{endpoint}的形式访问端点，了解程序运行情况
[端点详细](notes/actuator-endpoint.md)