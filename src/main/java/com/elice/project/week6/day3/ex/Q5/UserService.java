package com.elice.project.week6.day3.ex.Q5;

import java.util.UUID;

class UserService {
    private final String id;

    public UserService() {
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }
}
