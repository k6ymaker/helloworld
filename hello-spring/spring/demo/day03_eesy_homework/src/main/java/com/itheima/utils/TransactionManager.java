package com.itheima.utils;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 和事务管理相关的工具类，它包含了，开启事务，提交事务，回滚事务和释放连接
 */
public class TransactionManager {

    private ConnectionUtils connectionUtils;

    public void setConnectionUtils(ConnectionUtils connectionUtils) {
        this.connectionUtils = connectionUtils;
    }


    public Object around(ProceedingJoinPoint pjp){
        Object retValue = null;
        try{
            this.beginTranscation();
            Object[] args = pjp.getArgs();
            retValue = pjp.proceed(args);
            this.commit();
            return retValue;
        }catch (Throwable t){
            this.rollback();
            throw new RuntimeException(t);
        } finally {
            this.release();
        }
    }


    /**
     * 开启事务
     */
    public void beginTranscation(){
        try{
            System.out.println("事务开启");
            connectionUtils.getThreadConnection().setAutoCommit(false);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * 提交事务
     */
    public void commit(){
        try{
            System.out.println("事务提交");
            connectionUtils.getThreadConnection().commit();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * 回滚事务
     */
    public void rollback(){
        try{
            System.out.println("事务回滚");
            connectionUtils.getThreadConnection().rollback();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * 释放连接
     */
    public void release(){
        try{
            System.out.println("释放连接");
            connectionUtils.getThreadConnection().close(); //还回连接池中
            connectionUtils.removeConnection();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
