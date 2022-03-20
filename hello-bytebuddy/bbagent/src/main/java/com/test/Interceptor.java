//package com.test;
//
//import net.bytebuddy.asm.Advice;
//
//import java.lang.reflect.Method;
//
//public class Interceptor {
//
//    @Advice.OnMethodEnter
//    public static void enter(@Advice.This B b) {
//        System.out.println("enhance enter");
////        System.out.println("thread:" + thread.getName() + " enter thread timeMills:" + System.currentTimeMillis());
////        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
////
////        if (classLoader == null) {
////            try {
////                origin.invoke(null, thread);
////            } catch (Throwable e) {
////                e.printStackTrace();
////            }
////            return;
////        }
////
////        try {
////            Class reflectClass = Class.forName("com.tinysakura.bytebuddylearn.CustomThread", true, classLoader);
////            Method start = reflectClass.getMethod("start", Thread.class);
////            start.invoke(null, thread);
////        } catch (Throwable e) {
////            e.printStackTrace();
////        }
//    }
//}
