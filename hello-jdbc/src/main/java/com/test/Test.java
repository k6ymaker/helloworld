package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {
    public static void main(String[] args) throws Exception{
//        String JDBC_URL = "jdbc:mysql://localhost:3306/test?useSSL=false";
//        String JDBC_USER = "root";
//        String JDBC_PASSWORD = "password";

        String JDBC_URL = args[0];
        String JDBC_USER = args[1];
        String JDBC_PASSWORD = args[2];
        System.out.println("JDBC_URL:"+args[0]);
        System.out.println("JDBC_USER:"+args[1]);
        System.out.println("JDBC_PASSWORD"+args[2]);

        // 获取连接:
        Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
        // TODO: 访问数据库...
        Statement stmt = conn.createStatement();
        String sql = "select 'success';";
        ResultSet rs =  stmt.executeQuery(sql);
        while(rs.next()) {
            String success = rs.getString(1);
            System.out.println(success);
        }
        // 关闭连接:
        conn.close();
    }
}
