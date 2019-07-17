package example.eventhanding._1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Collections;

public class MessageRunner {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("message-event-handling-config.xml");
        context.refresh();
        context.start();

        context.refresh();
        Message message = (Message) context.getBean("message");
        System.out.println(message.getMessage());

        EmailService emailService = (EmailService) context.getBean("emailService");
        emailService.setBlackList(Collections.singletonList("r"));
        emailService.sendEmail("r", "t");

        context.stop();
        context.close();
    }
}
