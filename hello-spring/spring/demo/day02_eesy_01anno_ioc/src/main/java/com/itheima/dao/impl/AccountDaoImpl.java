package com.itheima.dao.impl;

import com.itheima.dao.IAccountDao;
import org.springframework.stereotype.Repository;

/*
*  账户持久层实现类
* */

@Repository("accountDao1")
public class AccountDaoImpl implements IAccountDao {
    public AccountDaoImpl(){
        System.out.println("construct AccountDaoImpl!");
    }

    public void saveAccount(){
        System.out.println("账户已保存1");
    }
}
