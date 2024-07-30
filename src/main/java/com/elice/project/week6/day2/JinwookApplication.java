package com.elice.project.week6.day2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//@SpringBootApplication
public class JinwookApplication {
	public static void main(String[] args) {
//		SpringApplication.run(JinwookApplication.class, args);

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		UserService userService = context.getBean(UserService.class);
		userService.saveUser("욱");

	}
}
