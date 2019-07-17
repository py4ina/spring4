package example.eventhanding._2;

import org.springframework.context.ApplicationEvent;

public class CustomSpringEvent extends ApplicationEvent {
    private String message;

    public CustomSpringEvent(Object source, String message) {
        super(source);
        this.message = message;
    }

    public String getMessage() {
        System.out.println(message);
        return message;
    }
}
