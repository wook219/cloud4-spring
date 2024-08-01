package com.elice.project.week6.day3;

import com.elice.project.week6.day2.AppConfig;
import com.elice.project.week6.day2.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ContainerMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        userService.saveUser("홍길동");
    }
}
