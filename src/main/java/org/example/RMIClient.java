package org.example;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIClient {
    public static void main(String[] args) throws Exception {
        Registry registry = LocateRegistry.getRegistry("127.0.0.1", 1099);
        for(String s:registry.list()){
            System.out.println(s);
        }

//        IRemoteObj remoteObj = (IRemoteObj) registry.lookup("remoteObj");
//        System.out.println(remoteObj.sayHello("hello"));
    }
}
