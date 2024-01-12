package com.test.client;

import com.test.dep.IHello;

import javax.naming.Context;
import javax.naming.InitialContext;
import java.util.Hashtable;

public class JNDICase {
    public static void main(String[] args) throws Exception {
        Hashtable env = new Hashtable<>();
        env.put(Context.INITIAL_CONTEXT_FACTORY,"com.sun.jndi.rmi.registry.RegistryContextFactory");

        env.put(Context.PROVIDER_URL,"rmi://:1099");
        Context ctx = new InitialContext(env);
        IHello iHello = (IHello)ctx.lookup("rmi://:1099/hello");
        iHello.sayHello("name");
    }
}
