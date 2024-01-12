package com.itheima.jdbctemplate;

import com.itheima.dao.IAcountDao;
import com.itheima.domain.Account;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * JdbcTemplate的最基本用法
 */
public class JdbcTemplateDemo4 {
    public static void main(String[] args) {
        //1.获容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //2.获取对象
        IAcountDao accountDao = ac.getBean("accountDao", IAcountDao.class);
        //3.执行操作
        //Account account = accountDao.findAccountById(2);
        //System.out.println(account);
        Account a = new Account();
        a.setMoney(1f);
        a.setName("50");
        a.setId(2);
        accountDao.updateAccount(a);
    }
}
