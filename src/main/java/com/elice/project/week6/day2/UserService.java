package com.elice.project.week6.day2;

public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void saveUser(String name){
        userRepository.save(name);
    }
}
