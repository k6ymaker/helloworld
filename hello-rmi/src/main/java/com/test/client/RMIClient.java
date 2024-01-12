package com.test.client;

import com.test.dep.IHello;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIClient {
    public static void main(String[] args)throws Exception {
        Registry registry =  LocateRegistry.getRegistry("",1099);
        IHello iHello = (IHello) registry.lookup("hello");
        System.out.println(iHello.sayHello("wang"));
    }
}
