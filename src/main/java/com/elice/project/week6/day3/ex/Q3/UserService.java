package com.elice.project.week6.day3.ex.Q3;

interface Service {
    String getDescription();
}

class UserService implements Service {
    @Override
    public String getDescription() {
        return "사용자 서비스";
    }
}
