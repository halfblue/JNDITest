package org.example;

import org.apache.naming.ResourceRef;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.Reference;
import javax.naming.StringRefAddr;
import java.util.Hashtable;

public class JNDIRMIServer {
    public static void main(String[] args) throws Exception{
//        Hashtable env = new Hashtable();
//        env.put(Context.INITIAL_CONTEXT_FACTORY,
//                "com.sun.jndi.rmi.registry.RegistryContextFactory");
//        env.put(Context.PROVIDER_URL,
//                "rmi://localhost:1099");

        InitialContext initialContext = new InitialContext();
//        initialContext.rebind("rmi://localhost:1099/remoteObj",new RemoteObjImpl());
//
        Reference refObj = new Reference("TestRef", "TestRef", "http://localhost:7777/");
        initialContext.rebind("rmi://localhost:1099/remoteObj", refObj);
    }
}
