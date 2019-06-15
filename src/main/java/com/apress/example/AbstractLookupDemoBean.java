package com.apress.example;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public class AbstractLookupDemoBean implements DemoBean {
    @Lookup
    public MyHelper getMyHelper() {
        System.out.println("-----");
        return null;
    }

    public void someOperation() {
        getMyHelper().doSomething();
    }
}
