package com.itheima.ui;
/**
 * 模拟一个表示层，用于调用业务层
 */



import com.itheima.service.IAccountService;
import com.itheima.service.impl.AccountServiceImpl;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {
    /**
     *
     *获取spring的Ioc核心容器，并根据id获取对象
     *
     * ApplicationContext的三个常用实现类:
     *       ClassPathXmlApplicationContext: 它可以加载类路径下的配置文件，要求配置文件必须在类路径下。
     *       FileSystemXmlApplicationContext: 它可以加载磁盘任意路径下的配置文件（必须有访问权限）
     *       AnnotationConfigApplicationContext: 它是用于读取注解创建容器的。
     *
     * 核心容器的两个接口引发的问题:
     * ApplicationContext:   //单例对象适用
     *     它在创建核心容器时，创建对象采取的策略是采用立即的加载方式。也就是说，只要一读取完配置文件，马上就创建。
     * BeanFactory:          //多例对象适用
     *     它在创建核心容器时，创建对象采取的策略是采用延时加载的方式。也就是说，什么时候根据id获取对象，什么时候才真正的创建对象。
     * //但是spring会根据配置的单例或多例去更改
     * @param args
     */
    public static void main(String[] args) {
//        //1.获取核心容器对象
//        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");// FileSystemXmlApplicationContext("Users/wangyuhao/Desktop/bean.xml");
//
//        //2.根据id获取Bean对象,两种方式
//        IAccountService as = (IAccountService)ac.getBean("accountService");
//        IAccountDao adao = ac.getBean("accountDao",IAccountDao.class);
//
//        System.out.println(as);
//        System.out.println(adao);

        // --- beanfactory ---
        Resource resource = new ClassPathResource("bean.xml");
        BeanFactory factory = new XmlBeanFactory(resource);
        IAccountService as  = (IAccountService)factory.getBean("accountDao");
        System.out.println(as);
    }
}