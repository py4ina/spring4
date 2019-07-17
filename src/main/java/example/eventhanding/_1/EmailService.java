package example.eventhanding._1;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

import java.util.List;

@Component(value = "emailService")
public class EmailService implements ApplicationEventPublisherAware {

    private List<String> blackList;
    private ApplicationEventPublisher publisher;

    public void setBlackList(List<String> blackList) {
        this.blackList = blackList;
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher = applicationEventPublisher;
    }

    public void sendEmail(String address, String text){
        if (blackList.contains(address)){
            BlackListEvent event = new BlackListEvent(this, address, text);
            publisher.publishEvent(event);
            return;
        }
    }
}
