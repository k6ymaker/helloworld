package com.itheima.service;

import com.itheima.domain.Account;

import java.util.List;

/*
* 账户的业务层接口
* */
public interface IAccountService {

    /**
     *查询所有
     */

    List<Account> findAllAccount();

    /**
     *查询一个
     */
    Account findAccountById(Integer accountId);


    /**
     *存储一个账户
     */
    void saveAccount(Account account);

    /**
     *更新操作
     */
    void updateAccount(Account account);

    /**
     *删除
     */
    void deleteAccount(Integer accountId);
}
