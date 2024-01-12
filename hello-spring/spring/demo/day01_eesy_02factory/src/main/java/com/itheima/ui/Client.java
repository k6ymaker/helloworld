package com.itheima.ui;
/**
 * 模拟一个表示层，用于调用业务层
 */

import com.itheima.factory.BeanFactory;
import com.itheima.service.IAccountService;
import com.itheima.service.impl.AccountServiceImpl;
public class Client {
    public static void main(String[] args) {
        //IAccountService as = new AccountServiceImpl();
        for(int i=0;i<5;i++){
            IAccountService as = (IAccountService) BeanFactory.getBean("accountService");
            as.saveAccount();
            System.out.println(as);
        }
    }
}