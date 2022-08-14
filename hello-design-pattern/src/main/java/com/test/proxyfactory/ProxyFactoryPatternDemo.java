package com.test.proxyfactory;

public class ProxyFactoryPatternDemo {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();

        proxyFactory.setTargetObject(new MathLesson());

        proxyFactory.setBeforeAdvice(new BeforeAdvice() {
            @Override
            public void before() {
                System.out.println("hello teacher");
            }
        });


        proxyFactory.setAfterAdvice(new AfterAdvice() {
            @Override
            public void after() {
                System.out.println("goodbye teacher");
            }
        });

        Lesson proxyMathLesson = (Lesson) proxyFactory.createProxy();

        proxyMathLesson.giveALesson();

    }
}
