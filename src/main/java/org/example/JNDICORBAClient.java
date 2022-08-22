package org.example;

import javax.naming.InitialContext;

/**
 * Hello world!
 *
 */
public class JNDICORBAClient
{
    public static void main( String[] args ) throws Exception
    {
//        IRemoteObj remoteObj = new RemoteObjImpl();
//        Hashtable env = new Hashtable();
//        env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.cosnaming.CNCtxFactory");
//        env.put(Context.PROVIDER_URL, "iiop://127.0.0.1:1050");
        InitialContext initialContext = new InitialContext();
        IRemoteObj hello = (IRemoteObj) initialContext.lookup("iiop://127.0.0.1:1050/remoteObj");
        hello.sayHello("Hello");
    }
}
