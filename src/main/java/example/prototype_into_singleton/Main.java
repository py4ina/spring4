package example.prototype_into_singleton;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        context.con

        SingletonBean firstSingleton = context.getBean(SingletonBean.class);
        PrototypeBean firstPrototype = firstSingleton.getPrototypeBean();
//        PrototypeBean firstPrototype = context.getPrototypeBean();

        SingletonBean secondSingleton = context.getBean(SingletonBean.class);
        PrototypeBean secondPrototype = secondSingleton.getPrototypeBean();
//        PrototypeBean secondPrototype = context.getPrototypeBean();

        System.out.println("firstPrototype == secondPrototype : " + firstPrototype.equals(secondPrototype));
        System.out.println("firstSingleton == secondSingleton : " + firstSingleton.equals(secondSingleton));

    }
}
