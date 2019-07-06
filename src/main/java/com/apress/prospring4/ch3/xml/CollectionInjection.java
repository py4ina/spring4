package com.apress.prospring4.ch3.xml;

import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.*;

public class CollectionInjection {
    private Map<String, Object> map;
    private Properties properties;
    private Set set;
    private List list;

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public Set getSet() {
        return set;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public void displayInfo() {
        System.out.println("Map contents:");
        for (Map.Entry<String, Object> entry : map.entrySet()){
            System.out.println("Key: " + entry.getKey() + " - Value: " + entry.getValue());
        }

        System.out.println("Properties content:");
        for (Map.Entry<Object, Object> entry : properties.entrySet()){
            System.out.println("Key: " + entry.getKey() + " - Value: " + entry.getValue());
        }

        System.out.println("Set content:");
        for (Object obj : set) {
            System.out.println("Value: " + obj);
        }

        System.out.println("List content:");
        for (Object obj : list) {
            System.out.println("Value: " + obj);
        }
    }

    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("META-INF/spring/app-context-xml.xml");
        context.refresh();

        CollectionInjection instance = (CollectionInjection) context.getBean("injectCollection");
        instance.displayInfo();
    }
}
