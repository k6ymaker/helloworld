package com.test.server;

import com.test.dep.IHello;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloImpl implements IHello {
    protected HelloImpl() throws RemoteException{
        UnicastRemoteObject.exportObject(this,0);
    }

    @Override
    public String sayHello(String name) throws RemoteException{
        System.out.println(name);
        return "hello " + name;
    }
}
