package com.apress.prospring4.ch3;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.util.StopWatch;

public class MethodReplacementExample {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("META-INF/spring/app-context-xml.xml");
        context.refresh();

        ReplacementTarget replacementTarget = (ReplacementTarget) context.getBean("replacementTarget");
        ReplacementTarget standartTarget = (ReplacementTarget) context.getBean("standardTarget");

        displayInfo(replacementTarget);
        displayInfo(standartTarget);
    }

    private static void displayInfo(ReplacementTarget target) {
        System.out.println(target.formatMessage("Hello World!"));

        StopWatch stopWatch = new StopWatch();
        stopWatch.start("perfTest");

        for (int x = 0; x < 1_000_000; x++){
            String out = target.formatMessage("foo");
        }

        stopWatch.stop();

        System.out.println("1_000_000 invocation took: " + stopWatch.getTotalTimeMillis() + " ms");
    }
}
