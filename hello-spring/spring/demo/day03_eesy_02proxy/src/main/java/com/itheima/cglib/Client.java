package com.itheima.cglib;

import com.itheima.cglib.Producer;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 模拟一个消费者
 */
public class Client {
    public static void main(String[] args) {
        final Producer producer = new Producer();

        /**
         * 动态代理:
         *  特点：字节码随用随创建，随用随加载
         *  作用: 不修改源码的基础上对方法增强
         *  分类：
         *      基于接口的动态代理
         *      基于子类的动态代理
         *  基于子类的动态代理：
         *      涉及的类：Proxy
         *      提供者: Enhancer create方法
         *  如何创建代理对象：
         *      被代理类不能是最终类
         *   newProxyInstance方法的参数:
         *      ClassLoader:类加载器
         *          它适用于加载代理对象字节码的。和被代理对象使用相同的类加载器。固定写法。
         *      Callback:用于提供增强的代码
         *          它是让我们写如何代理。我们一般都是写一个该接口的实现类，通常情况下都是匿名内部类，但不是必须的。
         *          此接口的实现类都是谁用谁写。
         *          我们一般写的都是该接口的子接口实现类
         */
        Producer p = (Producer) Enhancer.create(producer.getClass(), new MethodInterceptor() {
            /**
             * 执行被代理对象的任何方法都会经过该方法
             * @param o
             * @param proxy
             * @param objects
             * @param args
             * @return
             * @throws Throwable
             */
            public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
                Object o = null;
                Float money = (Float) args[0];
                if(method.getName()=="saleProduct"){
                    o =  method.invoke(producer,money*0.8f);
                }
                return o;
            }
        });
        p.saleProduct(1000f);
    }
}
