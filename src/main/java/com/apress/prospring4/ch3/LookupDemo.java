package com.apress.prospring4.ch3;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.util.StopWatch;

public class LookupDemo {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("META-INF/spring/app-context-xml.xml");
        context.refresh();

        DemoBean abstractBean = (DemoBean) context.getBean("abstractLookupBean");
        DemoBean standardBean = (DemoBean) context.getBean("standardLookupBean");

        displayInfo(standardBean);
        displayInfo(abstractBean);
    }

    private static void displayInfo(DemoBean bean) {
        MyHelper myHelper1 = bean.getMyHelper();
        MyHelper myHelper2 = bean.getMyHelper();

        System.out.println("myHelper1 == myHelper2 ?: " + (myHelper1 == myHelper2));

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        for (int x = 0; x < 1_00_000; x++) {
            MyHelper helper = bean.getMyHelper();
            helper.doSomethingHelpful();
        }

        stopWatch.stop();
        System.out.println("1_00_000 gets took " + stopWatch.getTotalTimeMillis() + " ms");
    }
}
