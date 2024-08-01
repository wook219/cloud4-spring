package com.elice.project.week6.day3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class AppConfig{
    @Bean
    public MyService myService(){
        return new MyService();
    }
}

class MyService{

}

public class SingletonExample {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        MyService service1 = context.getBean(MyService.class);
        MyService service2 = context.getBean(MyService.class);

        System.out.println("service1 인스턴스 : " + service1);
        System.out.println("service2 인스턴스 : " + service2);
        System.out.println("동일 인스턴스 여부 : " + (service1 == service2));
    }
}
