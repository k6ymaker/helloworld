package com.test;

import com.beust.jcommander.JCommander;

public class Main {
    public static void main(String[] args) {
        Arg arg = new Arg();
        JCommander.newBuilder()
                .addObject(arg)
                .build()
                .parse(args);

        System.out.println(arg.getVerbose());
    }
}
