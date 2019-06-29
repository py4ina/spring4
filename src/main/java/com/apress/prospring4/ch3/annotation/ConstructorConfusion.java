package com.apress.prospring4.ch3.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service("constructorConfusion")
public class ConstructorConfusion {
    private String someValue;

    public ConstructorConfusion(String someValue) {
        System.out.println("ConstructorConfusion(String) called");
        this.someValue = someValue;
    }

    @Autowired
    public ConstructorConfusion(@Value("90") int someValue) {
        System.out.println("ConstructorConfusion(int) called ->> annotation");
        this.someValue = "Number: " + someValue;
    }

    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("META-INF/spring/app-context-annotation.xml");
        context.refresh();

        ConstructorConfusion constructorConfusion = (ConstructorConfusion) context.getBean("constructorConfusion");
        System.out.println(constructorConfusion);
    }

    public String toString(){
        return someValue; /*Constructor Injection:constructor confusion*/
    }
}
