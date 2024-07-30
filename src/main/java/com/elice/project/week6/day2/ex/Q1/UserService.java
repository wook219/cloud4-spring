package com.elice.project.week6.day2.ex.Q1;

interface Service{
    String getUserName();
}

public class UserService implements Service{
    // 지시사항 3번을 참고하여 코드를 작성하세요.
    @Override
    public String getUserName(){
        return "Alice";
    }
}
