# Springboot 推荐的目录结构
```
 +- Application.java
      |
      +- domain
      |  +- Customer.java
      |  +- CustomerRepository.java
      |
      +- service
      |  +- CustomerService.java
      |
      +- controller
      |  +- CustomerController.java

```
1、Application.java 建议放到跟目录下面,主要用于做一些框架配置

2、domain目录主要用于实体（Entity）与数据访问层（Repository）

3、service 层主要是业务类代码

4、controller 负责页面数据访问控制 

启动Application main方法，至此一个基于SpringBoot 项目搭建好了！

# 引入web模块
```xml
<dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
 </dependency>
```

pom.xml文件中默认有两个模块：

- spring-boot-starter：核心模块，包括自动配置支持、日志和YAML；

- spring-boot-starter-test：测试模块，包括JUnit、Hamcrest、Mockito。