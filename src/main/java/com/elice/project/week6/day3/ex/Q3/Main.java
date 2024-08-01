package com.elice.project.week6.day3.ex.Q3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // 지시사항을 참고하여 코드를 작성해 보세요.
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        String[] allBeanNames = applicationContext.getBeanDefinitionNames();
        for(String beanName : allBeanNames){
            System.out.println(beanName);
        }
    }
}
