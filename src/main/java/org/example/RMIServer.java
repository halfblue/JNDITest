package org.example;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIServer {
    public static void main(String[] args) throws RemoteException, AlreadyBoundException {
        RemoteObjImpl remoteObj = new RemoteObjImpl();
        Registry r = LocateRegistry.createRegistry(1099);
//        r.bind("remoteObj",remoteObj);
    }
}