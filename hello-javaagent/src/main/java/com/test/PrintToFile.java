package com.test;

import java.io.*;

public class PrintToFile {
    /**
     * 写入日志 filePath 日志文件的路径 code 要写入日志文件的内容
     */
    public static boolean print(String filePath, String code) {
        try {
            File tofile = new File(filePath);
            FileWriter fw = new FileWriter(tofile, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.println("[]"+ ":" + code);
            pw.close();
            bw.close();
            fw.close();
            return true;
        } catch (IOException e) {
            System.out.println(e);
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(print("/tmp/a", "hahahhhah"));
    }
}