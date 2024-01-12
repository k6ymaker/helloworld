package com.itheima.service.impl;


import com.itheima.service.IAccountService;
/**
 *  账户的业务层实现类
 */
public class AccountServiceImpl implements IAccountService {

    public AccountServiceImpl(){
        System.out.println("construct AccountServiceImpl!");
    }

    public void saveAccount() {
        System.out.println("service中的saveAccount方法执行了。。。");
    }

    public void init(){
        System.out.println("AccountServiceImpl init is called.");
    }

    public void destroy(){
        System.out.println("AccountServiceImpl destroy is called.");
    }
}
