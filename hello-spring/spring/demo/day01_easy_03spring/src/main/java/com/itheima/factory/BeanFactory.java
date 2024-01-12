package com.itheima.factory;

import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/*
* 一个创建Bean对象的工厂
* Bean: 在计算机英语中，有可重用组件的含义。
* JavaBean: 用java语言编写的可重用组件。
*     javabean  > 实体类
*
*   就是创建我们的service和dao对象的。
*   第一：需要一个配置文件来配置我们的service和dao
*         配置内容：唯一标识别=权限定类名(key=value)
*   第二：通过读取配置文件中的配置内容，反射创建对象
*
*   配置文件：xml、properties
* */
public class BeanFactory {
    //定一个一个Properties对象
    private  static Properties props;

    //定一个一个Map,用于存放我们要创建的对象。我们把它称之为容器
    private static Map<String,Object> beans;

    static {
        try {
            //实力化对象
            props = new Properties();
            //获取properties的流对象
            InputStream in = BeanFactory.class.getClassLoader().getResourceAsStream("bean.properties");
            props.load(in);
            //实例化容器
            beans = new HashMap<String,Object>();
            //取出配置文件中所有的Key
            Enumeration keys = props.keys();
            //遍历枚举
            while(keys.hasMoreElements()){
                //取出每个key
                String key = keys.nextElement().toString();
                //根据key获取value
                String beanPath = props.getProperty(key);
                //反射创建对象
                Object value = Class.forName(beanPath).newInstance();
                //把key和value存入容器中
                beans.put(key,value);
            }

        }catch (Exception e){
            throw  new ExceptionInInitializerError("初始化properties失败！");
        }
    }

    public static Object getBean(String beanName){
        return beans.get(beanName);
    }
//    public static Object getBean(String beanName){
//        Object bean = null;
//        try{
//            String beanPath = props.getProperty(beanName);
//            bean = Class.forName(beanPath).newInstance();
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        return bean;
//    }
}
