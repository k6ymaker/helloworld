package com.test.server;

import com.test.dep.IHello;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class RMIServer {
    public static void main(String[] args) throws Exception{
        IHello iHello = new HelloImpl();
        LocateRegistry.createRegistry(1099);
        Naming.bind("rmi://0.0.0.0:1099/hello",iHello);
    }
}
