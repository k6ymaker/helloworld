package com.itheima.dao.impl;

import com.itheima.dao.IAccountDao;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Repository("accountDao2")
public class AccountDaoImpl2 implements IAccountDao {
    public AccountDaoImpl2(){
        System.out.println("construct AccountDaoImpl2!");
    }

    public void saveAccount(){
        System.out.println("账户已保存2");
    }

}