package com.elice.project.week6.day5.ex.Q1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EventRegistrationViewController {
    @GetMapping("/event")
    public String getUserInfo() {
        return "userInfoForm";
    }
}
