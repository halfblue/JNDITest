package org.example;

import javax.naming.InitialContext;
import javax.naming.NameClassPair;
import javax.naming.NamingEnumeration;
import javax.naming.ldap.LdapName;

public class JNDILDAPClient {
    public static void main(String[] args) throws Exception{
        InitialContext initialContext = new InitialContext();
        initialContext.lookup("ldap://localhost:10389/cn=test,dc=example,dc=com");
    }
}
