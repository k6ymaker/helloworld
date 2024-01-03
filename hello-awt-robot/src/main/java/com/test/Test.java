package com.test;

import java.awt.*;
import java.awt.event.InputEvent;

public class Test {
    public static void main(String[] args) throws Exception{
        Robot robot = new Robot();
//        double r = 300d;
//        double x = 600d,y = 600d;
//        double start = 0d;
//        while(true){
//            robot.mouseMove((int)(r*Math.cos(start)+x),(int)(r*Math.sin(start)+y));
//            robot.delay(50);
//            start += 0.1d;
//            if(start>100)
//                break;
//        }
        //robot.mouseMove(480,408);
        robot.mouseMove(495-10,554+52-26-20);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mousePress(InputEvent.BUTTON2_DOWN_MASK);
//        robot.mousePress(InputEvent.BUTTON2_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }
}
