package example.eventhanding._1;

import org.springframework.context.ApplicationListener;

public class Message implements ApplicationListener<BlackListEvent> {
    private String message = "Hello!!!!!";

    public String getMessage() {
        return message;
    }

    @Override
    public void onApplicationEvent(BlackListEvent event) {
        System.out.println("BlackListEvent");
    }
}
