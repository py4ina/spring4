package example.prototype_into_singleton;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SingletonAppContextBean  implements ApplicationContextAware {
    private ApplicationContext applicationContext;

    public PrototypeBean getPrototypeBean(){
        return applicationContext.getBean(PrototypeBean.class);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}