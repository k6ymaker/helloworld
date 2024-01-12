package com.itheima.dao;

import com.itheima.domain.Account;

public interface IAccountDao {
    /**
     * 根据Id查询账户
     * @param accountId
     * @return
     */
    Account findAccountById(Integer accountId);

    /**
     * 根据name查询账户
     * @param accountName
     * @return
     */
    Account findAccountByName(String accountName);


    /**
     * 更新账户
     * @param account
     */
    void updateAccount(Account account);
}
