package com.itheima.dao.impl;

import com.itheima.dao.IAccountDao;

/*
*  账户持久层实现类
* */
public class AccountDaoImpl implements IAccountDao {
    public void saveAccount(){
        System.out.println("账户已保存");
    }
}
//impl的全称为implement

//DAO类都是进行数据操作的类，是对于数据库中的数据做增删改查等操作的代码。
//
//DAO(Data Access Object) 数据访问对象是一个面向对象的数据库接口，
//它显露了 Microsoft Jet 数据库引擎（由 Microsoft Access 所使用），
//并允许 Visual Basic 开发者通过 ODBC 像直接连接到其他数据库一样，直接连接到 Access 表。
//DAO 最适用于单系统应用程序或小范围本地分布使用。
//
//DAO层一般有接口和该接口的实现类，接口用于规范实现类，实现类一般用于用于操作数据库！
//一般操作修改，添加，删除数据库操作的步骤很相似，就写了一个公共类DAO类 ，修改，添加，删除数据库操作时直接调用公共类DAO类。