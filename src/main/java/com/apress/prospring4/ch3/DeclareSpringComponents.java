package com.apress.prospring4.ch3;

import org.springframework.context.support.GenericXmlApplicationContext;

public class DeclareSpringComponents {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("META-INF/spring/app-context-annotation.xml");
        context.refresh();

        MessageProvider messageProvider = context.getBean("messageProvider", MessageProvider.class);
        System.out.println(messageProvider.getMessage());

//        MessageRenderer messageRenderer = context.getBean("messageRenderer", MessageRenderer.class);
//        messageRenderer.render();

    }
}
