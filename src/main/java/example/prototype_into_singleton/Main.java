package example.prototype_into_singleton;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        SingletonAppContextBean singletonAppContextBean = new SingletonAppContextBean();
        singletonAppContextBean.setApplicationContext(context);

//        SingletonBean firstSingleton = context.getBean(SingletonBean.class);
//        PrototypeBean firstPrototype = firstSingleton.getPrototypeBean();
//
//        SingletonBean secondSingleton = context.getBean(SingletonBean.class);
//        PrototypeBean secondPrototype = secondSingleton.getPrototypeBean();

//        System.out.println("firstPrototype == secondPrototype : " + firstPrototype.equals(secondPrototype));
//        System.out.println("firstSingleton == secondSingleton : " + firstSingleton.equals(secondSingleton));

        PrototypeBean firstPrototype = singletonAppContextBean.getPrototypeBean();
        PrototypeBean secondPrototype = singletonAppContextBean.getPrototypeBean();
        System.out.println(firstPrototype.equals(secondPrototype));

    }
}
