package com.test;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;

import java.io.File;

public class Test {
    public static void main(String[] args) throws Exception{
        ITesseract instance = new Tesseract();  // JNA Interface Mapping
        instance.setDatapath("./tessdata"); // path to tessdata directory
        instance.setLanguage("chi_sim");
        String result = instance.doOCR(new File("img_2.png"));
        System.out.println(result);
    }
}
