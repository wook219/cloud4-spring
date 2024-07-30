package com.elice.project.week6.day2;

public class UserRepositoryImpl implements UserRepository{

    @Override
    public void save(String userName) {
        System.out.println("사용자 저장 : " + userName);
    }
}
