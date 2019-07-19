package example.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Configuration
@ComponentScan
public class Spring {

    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(Spring.class);
    }

    @Autowired
    @Platform(Platform.OperatingSystems.ANDROID)
    private MarketPlace android;

    @Autowired
    @Platform(Platform.OperatingSystems.IOS)
    private MarketPlace ios;

    @PostConstruct
    public void qualifyTheTweets() {
        System.out.println("ios:" + this.ios);
        System.out.println("android:" + this.android);
    }


    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.TYPE, ElementType.PARAMETER})
    @Retention(RetentionPolicy.RUNTIME)
    @Qualifier
    public static @interface Platform {
        OperatingSystems value();

        public static enum OperatingSystems {
            IOS,
            ANDROID
        }
    }

}

interface MarketPlace {
}

@Component
@Spring.Platform(Spring.Platform.OperatingSystems.IOS)
class AppleMarketPlace implements MarketPlace {

    @Override
    public String toString() {
        return "apple";
    }
}

@Component
@Spring.Platform(Spring.Platform.OperatingSystems.ANDROID)
class GoogleMarketPlace implements MarketPlace {

    @Override
    public String toString() {
        return "android";
    }
}
