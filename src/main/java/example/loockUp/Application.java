package example.loockUp;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("application.xml");
        context.refresh();

        DemoBean demoBean = (DemoBean) context.getBean("abstractLookupDemoBean");
        demoBean.someOperation();

        MyHelper helper1 = demoBean.getMyHelper();
        MyHelper helper2 = demoBean.getMyHelper();
        System.out.println("Helper Instances the Same?: " + (helper1 == helper2));
    }
}
