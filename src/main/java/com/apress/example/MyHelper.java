package com.apress.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "myHelper")
@Scope("prototype")
public class MyHelper {
    public void doSomething(){
        System.out.println("MyHelper.doSomething()");
    }
}
