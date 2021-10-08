package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {
    public static void main(String[] args) throws Exception{
        // JDBC连接的URL, 不同数据库有不同的格式:
        String JDBC_URL = "jdbc:mysql://localhost:3306/test";
        String JDBC_USER = "root";
        String JDBC_PASSWORD = "password";
        // 获取连接:
        Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
        // TODO: 访问数据库...
        Statement stmt = conn.createStatement();
        String sql = "select * from user where name='xiaoming'";
        ResultSet rs =  stmt.executeQuery(sql);
        while(rs.next()) {
            String name = rs.getString(1);
            int age = rs.getInt(2);
            System.out.println(age);
            System.out.println(name);
        }
        // 关闭连接:
        conn.close();
    }
}
