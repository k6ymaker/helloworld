package com.test;
import java.lang.instrument.Instrumentation;

public class AgentLauncher {
    public static void premain(String args, Instrumentation inst) {
        System.out.println("i'm premain!");
    }
}
