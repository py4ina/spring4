package com.apress.prospring4.ch3.annotation;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

@Service("injectCollection")
public class CollectionInjection {
    @Resource(name = "map")
    private Map<String, Object> map;
    @Resource(name = "properties")
    private Properties properties;
    @Resource(name = "set")
    private Set set;
    @Resource(name = "list")
    private List list;

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
        context.load("META-INF/spring/app-context-annotation.xml");
        context.refresh();

        CollectionInjection instance = (CollectionInjection) context.getBean("injectCollection");
        instance.displayInfo();
    }
}
