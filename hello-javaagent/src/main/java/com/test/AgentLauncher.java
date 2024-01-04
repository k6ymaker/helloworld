package com.test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.instrument.Instrumentation;
import java.util.Map;

public class AgentLauncher {
    //private static final Logger LOGGER = LoggerFactory.getLogger(AgentLauncher.class);

    public static void premain(String args, Instrumentation inst) {

    }

    public static void agentmain(String args, Instrumentation inst) throws Exception {

//        String tmp = "";
//
//        for (Map.Entry<Thread,StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet())
//        {
//            Thread thread = entry.getKey();
//
//            StackTraceElement[] stackTraceElements = entry.getValue();
//
//            if (thread.equals(Thread.currentThread()))
//            {
//                continue;
//            }
//
//            LOGGER.info("\n线程： " + thread.getName() + "\n");
//            for (StackTraceElement element : stackTraceElements)
//            {
//                LOGGER.info("\t" + element + "\n");
//            }
//
//
//        }

        System.out.println("[java.io.tempdir]"+System.getProperty("java.io.tmpdir"));
    }
}
