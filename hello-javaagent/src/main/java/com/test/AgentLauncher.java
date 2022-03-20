package com.test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.instrument.Instrumentation;
import java.net.InetAddress;
import java.util.Map;

public class AgentLauncao {
    private static final Logger LOGGER = LoggerFactory.getLogger(AgentLauncao.class);

    public static void premain(String args, Instrumentation inst) {

    }

    public static void agentmain(String args, Instrumentation inst) throws Exception {

        for (Map.Entry<Thread,StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet())
        {
            Thread thread = entry.getKey();

            StackTraceElement[] stackTraceElements = entry.getValue();

            if (thread.equals(Thread.currentThread()))
            {
                continue;
            }

            System.out.println("\n线程： " + thread.getName() + "\n");
            for (StackTraceElement element : stackTraceElements)
            {
                System.out.println("\t" + element + "\n");
            }
        }
    }
}
