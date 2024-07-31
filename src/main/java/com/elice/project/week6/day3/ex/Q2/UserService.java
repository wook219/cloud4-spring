package com.elice.project.week6.day3.ex.Q2;

interface Service {
    String getUserName();
}

class UserService implements Service {
    @Override
    public String getUserName() {
        return "홍길동";
    }
}
