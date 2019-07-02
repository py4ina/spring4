package com.apress.prospring4.ch3;

import org.springframework.context.support.GenericXmlApplicationContext;

public class HierarchicalAppContextUsage {
    public static void main(String[] args) {
        GenericXmlApplicationContext pattern = new GenericXmlApplicationContext();
        pattern.load("META-INF/spring/parent.xml");
        pattern.refresh();

        GenericXmlApplicationContext child = new GenericXmlApplicationContext();
        pattern.load("META-INF/spring/child.xml");
        child.setParent(pattern);
        child.refresh();

        SimpleTarget target1 = (SimpleTarget) child.getBean("target1");
        SimpleTarget target2 = (SimpleTarget) child.getBean("target2");
        SimpleTarget target3 = (SimpleTarget) child.getBean("target3");
    }
}
