package com.test;

//import org.opencv.core.*;
//import org.opencv.imgcodecs.Imgcodecs;

import org.opencv.core.Mat;
import org.opencv.highgui.HighGui;
import org.opencv.imgcodecs.Imgcodecs;

public class ImageShow {
    static {
        // 载入dll或者lib包（必须先加载）
        System.load("/opt/homebrew/Cellar/opencv/4.5.5/share/java/opencv4/libopencv_java455.dylib");

    }
    public static void main(String[] args) {
        Mat src = Imgcodecs.imread("./PatrickStar.jpeg", Imgcodecs.IMREAD_UNCHANGED);

        HighGui.imshow("BigImg", src);
        HighGui.waitKey();
    }
}