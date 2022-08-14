package com.test.proxyfactory;

public class MathLesson  implements Lesson{
    @Override
    public void giveALesson() {
        System.out.println("leaning math...");
    }
}
