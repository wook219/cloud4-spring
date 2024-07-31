package com.elice.project.week6.day3.ex.Q7;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FactorialTest {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(FactorialConfig.class);

        // 지시사항을 참고하여 코드를 작성해 보세요.
        Factorial factorial = applicationContext.getBean(Factorial.class);
        factorial.factorial(20);
    }
}
