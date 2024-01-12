package com.itheima.dao;

import com.itheima.domain.Account;
import java.util.List;

/**
 * 账户持久层接口
 */
public interface IAccountDao {
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

    /**
     * 根据名称查账户
     * @param accountName
     * @return 如果有唯一的结果就返回，如果没有结果就返回null
     *         如果结果集超过一个，就返回异常
     */
    Account findAccountByName(String accountName);
}
