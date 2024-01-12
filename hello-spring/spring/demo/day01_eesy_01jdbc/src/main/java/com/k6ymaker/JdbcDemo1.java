package com.k6ymaker;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *  程序的耦合
 *
 *  解耦:
 *  (1)使用反射创建对象，而避免使用new关键词
 *     Class.forName("com.mysql.jdbc.Driver");
 *  (2)通过读取配置文件获取要创建的对象全限定类名
 * */

public class JdbcDemo1 {
    public static void main(String[] args) throws Exception{
        //1.注册驱动
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        //2.获取链接
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/eesy","root","5826838");
        //3.获取操作数据库的预处理对象
        PreparedStatement pstm = conn.prepareStatement("select * from account");
        //4.执行SQL，得到结果集
        ResultSet rs = pstm.executeQuery();
        //5.遍历结果集
        while(rs.next()){
            System.out.println(rs.getString("name"));
        }
        //6.释放资源
        rs.close();
        pstm.close();
        conn.close();
    }
}



//create table account(
//        id int primary key auto_increment,
//        name varchar(40),
//        money float
//)character set utf8 collate utf8_general_ci;
//
//insert into account(name,money) value('aaa',1000);
//insert into account(name,money) value('bbb',1000);
//insert into account(name,money) value('ccc',1000);