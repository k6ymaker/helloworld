package com.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args)throws Exception {
        while(true){
            Thread.sleep(1000 * 1);
            logger.info("{}","hello");
            logger.error("{}","hello");
            logger.warn("{}","hello");
        }
    }
}
