package com.elice.project.week6.day3.ex.Q6;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfig {

    // 지시 사항에 따라 코드를 작성해 보세요.
    @Bean(name = "singletonCounter")
    @Scope("singleton")
    public Counter singletonCounter(){
        return new Counter();
    }

    @Bean(name = "prototypeCounter")
    @Scope("prototype")
    public Counter prototypeCounter(){
        return new Counter();
    }

}
