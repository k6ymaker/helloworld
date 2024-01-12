####课程链接

https://www.bilibili.com/video/av47952931?p=53

05.编写工程类和配置文件

看到p53，这个up主还有其它的视频，可以看一下

https://space.bilibili.com/15212655/channel/detail?cid=69459

关于java的:

spring boot

jvm深入理解

mybatis

spring

springmvc



spring官方文档:

<https://docs.spring.io/spring/docs/current/spring-framework-reference/core.html#beans-definition>

# 简介

以IOC(Inverse Of Control)反转控制和AOP（Aspect Oriented Programming）面向切面编程为内核，提供展现层Spring MVC 和持久成 Spring JDBC 以及业务层事务管理等众多企业级应用技术。

## 优势

##体系结构

![spring体系结构](/Users/wangyuhao/Desktop/笔记/java/框架/spring体系结构.png)



## IOC(Inversion of Control)

![IOC](/Users/wangyuhao/Desktop/笔记/java/框架/IOC.jpeg)

```
private IAccountDao accountDao = new AccountDaoImpl(); 
//代码中直接去实例化类
private IAccountDao accountDao = (IAccountDao)BeanFactory.getBean("accountDao");
//通过配置字符串accountDao，由工厂去控制具体实例化哪个类，来达到控制反转
```

定义:把创建对象的权利交给框架，是框架的重要特征，并非面向对象编程的专用术语。它包括依赖注入(Dependency Inject,简称DI)和依赖查找(Dependency Lookup)。

作用:削减计算机程序的耦合性。



## 获取spring容器

###BeanFactory  //多例对象适用

它在创建核心容器时，创建对象采取的策略是采用延时加载的方式。也就是说，什么时候根据id获取对象，什么时候才真正的创建对象。

###ApplicationContext  //单例对象适用

 它在创建核心容器时，创建对象采取的策略是采用立即的加载方式。也就是说，只要一读取完配置文件，马上就创建。

| 实现                                 |                               |
| ---------------------------------- | ----------------------------- |
| ClassPathXmlApplicationContext     | 它可以加载类路径下的配置文件，要求配置文件必须在类路径下。 |
| FileSystemXmlApplicationContext    | 它可以加载磁盘任意路径下的配置文件（必须有访问权限）    |
| AnnotationConfigApplicationContext | 它是用于读取注解创建容器的。                |



## Spring基于XML的IOC的环境

- spring的ioc解决什么样的问题

- spring基于xml的开发环境

  - 创建bean的三种方式
    -  使用默认构造函数
    -  使用普通工厂中的方法创建
    -  使用工程中的静态方法


  - 作用范围(prototype、singleton)


  - bean的生命周期

- 依赖关系的注入(Dependency Injection)

  - 注入的方式

    - 使用构造函数提供

    - 使用set方式提供

    - 使用注解提供
  - 能注入的数据
    - 其他类型和String(基础类型)

    - 其他bean类型(在配置文件中或注解配置过的bean)

    - 复杂类型/集合类型

- 注解

   - 可以为自己写的类上的操作

      -    spring容器中注册(<bean>): @Component 、 @Controller、@Service 、  @Repository

        -    注入数据(<property>): @Autowired、 @Qualifier、@Resource

        -    生命周期:@Scope

        -    生命周期相关:@PreDestory、@PostConstruct

      

   - 配置(AnnotationConfigApplicationContext注册spring配置)

      - 设置配置类：@Configuration
      - spring扫描：@ComponentScan
      - 导入其他的配置类，以父子的关系: @Import
      - 向容器中注册函数返回的类: @Bean, 与上面自己写的类相对应。
      - 指定properties的文件:@PropertySource 

