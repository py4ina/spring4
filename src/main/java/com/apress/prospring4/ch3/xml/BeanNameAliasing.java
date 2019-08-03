package com.apress.prospring4.ch3.xml;

import org.springframework.context.support.GenericXmlApplicationContext;

import javax.naming.InitialContext;
import javax.naming.NamingException;

public class BeanNameAliasing {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("META-INF/spring/app-context-xml.xml");
        context.refresh();

        String s1 = (String) context.getBean("name1");
        String s2 = (String) context.getBean("name2");
        String s3 = (String) context.getBean("name3");
        String s4 = (String) context.getBean("name4");
        String s5 = (String) context.getBean("name5");
        String s6 = (String) context.getBean("name6");

        try {
            InitialContext initialContext = new InitialContext();
            String s = (String) initialContext.lookup("java:app/META-INF/spring/app-context-xml.xml.name6");
            System.out.println(s);
        } catch (NamingException e) {
            e.printStackTrace();
        }

        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(s3 == s4);
        System.out.println(s4 == s5);
        System.out.println(s5 == s6);

        String[] strings = context.getAliases("name1");
        System.out.println(strings);
    }
}
