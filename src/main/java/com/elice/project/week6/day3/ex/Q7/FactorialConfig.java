package com.elice.project.week6.day3.ex.Q7;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

// 지시사항에 따라 코드를 작성해 보세요.
@EnableAspectJAutoProxy
@Configuration
@ComponentScan
public class FactorialConfig {

    // 지시사항에 따라 코드를 작성해 보세요.
    public Factorial factorial() {
        return new FactorialWithRecursion();
    }
}
