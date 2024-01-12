package com.itheima.factory;

import com.itheima.domain.Account;
import com.itheima.service.IAccountService;
import com.itheima.utils.TransactionManager;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 用于创建Service的代理对象的工厂
 */
public class BeanFactory {
    private IAccountService accountService;
    public void setTxManager(TransactionManager txManager) {
        this.txManager = txManager;
    }

    private TransactionManager txManager;
    /**
     * 获取Service代理对象
     * @return
     */
    public IAccountService getAccountService() {
        IAccountService re =  (IAccountService) Proxy.newProxyInstance(accountService.getClass().getClassLoader(), accountService.getClass().getInterfaces(), new InvocationHandler() {
            /**
             * 添加事务支持
             * @param proxy
             * @param method
             * @param args
             * @return
             * @throws Throwable
             */
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object rtValue = null;
                try{
                    //1.开启事务
                    txManager.beginTranscation();
                    //2.执行操作
                    rtValue = method.invoke(accountService,args);
                    //3.提交事务
                    txManager.commit();
                    //4.返回结果
                    return rtValue;
                }catch (Exception e){
                    //5.回滚操作
                    txManager.rollback();
                    throw new RuntimeException(e);
                }finally {
                    //6.释放连接
                    txManager.release();
                }
            }
        });
        return re;
    }

    public final void setAccountService(IAccountService accountService) {
        this.accountService = accountService;
    }
}
