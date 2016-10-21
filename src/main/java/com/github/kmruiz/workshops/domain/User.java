package com.github.kmruiz.workshops.domain;

import com.github.kmruiz.workshops.domain.events.RegisteredUserEvent;

public class User implements IUser {

    private final String userName;

    public User(String username) {
        this.userName = username;
    }

    @Override
    public RegisteredUserEvent createRegisterdUser(String password) {
        return new RegisteredUserEvent(getUserName(), password);
    }

    public String getUserName() {
        return userName;
    }
}
