package com.apress.prospring4.ch3;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.apress.prospring4.ch3.xml.SimpleTarget;

public class HierarchicalAppContextUsage {
    public static void main(String[] args) {
        GenericXmlApplicationContext pattern = new GenericXmlApplicationContext();
        pattern.load("META-INF/spring/parent.xml");
        pattern.refresh();

        GenericXmlApplicationContext child = new GenericXmlApplicationContext();
        pattern.load("META-INF/spring/app-context-xml.xml");
        child.setParent(pattern);
        child.refresh();

        SimpleTarget target1 = (SimpleTarget) child.getBean("target1");
        SimpleTarget target2 = (SimpleTarget) child.getBean("target2");
        SimpleTarget target3 = (SimpleTarget) child.getBean("target3");

        System.out.println(target1.getVal());
        System.out.println(target2.getVal());
        System.out.println(target3.getVal());
    }
}
