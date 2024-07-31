package com.elice.project.week6.day3.ex.Q5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class AppConfig {
    @Bean
    public UserService userService() {
        return new UserService();
    }
}
