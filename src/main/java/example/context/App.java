package example.context;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext("example.context");

        GreetingService greetingService = context.getBean(GreetingService.class);
        greetingService.greet();

        context.close();
    }
}
