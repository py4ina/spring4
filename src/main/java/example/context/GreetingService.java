package example.context;

import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class GreetingService {
    private static final Logger logger = Logger.getLogger(GreetingService.class.getName());

    public GreetingService() {
    }

    public void greet() {
        logger.info("Gaurav Bytes welcomes you for your first tutorial on Spring!!!");
    }
}
