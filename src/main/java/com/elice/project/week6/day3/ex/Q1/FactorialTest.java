package com.elice.project.week6.day3.ex.Q1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FactorialTest {
    public static void main(String[] args) {

        // 지시사항에 따라 코드를 작성해 보세요.
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(FactorialConfig.class);
        FactorialWithRecursion factorialWithRecursion = context.getBean(FactorialWithRecursion.class);
        factorialWithRecursion.factorial(20);
    }
}
