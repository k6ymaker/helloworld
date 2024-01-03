package com.test;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileFilter;

public class Test {
    public static void main(String[] args) throws Exception{
        File testa = new File("./testa");
        File testc = new File("./testc");
        FileUtils.copyDirectory(testa, testc,(t)-> !t.getName().equals("test"));
    }
}
