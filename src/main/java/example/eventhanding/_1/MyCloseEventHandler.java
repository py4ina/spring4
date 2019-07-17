package example.eventhanding._1;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;

public class MyCloseEventHandler implements ApplicationListener<ContextClosedEvent> {
    @Override
    public void onApplicationEvent(ContextClosedEvent event) {
        System.out.println("Close!");
    }
}
