package com.test;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ExceptionTest {
    Logger logger = LoggerFactory.getLogger(ExceptionTest.class);

    @Test
    public void test(){
        try{
            System.out.println(1/0);
        }catch (Exception e){
            logger.error(e.getMessage());
        }
    }
}
