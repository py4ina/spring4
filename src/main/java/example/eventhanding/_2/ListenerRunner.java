package example.eventhanding._2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ListenerRunner {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("message-event-handling-config.xml");
        context.refresh();

        CustomSpringEventPublisher publisher = (CustomSpringEventPublisher) context.getBean("customSpringEventPublisher");
        publisher.doStuffAndPublishAnEvent("iiiiiiiiiiiiiiii");

    }
}
