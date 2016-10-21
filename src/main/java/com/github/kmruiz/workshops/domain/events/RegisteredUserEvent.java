package com.github.kmruiz.workshops.domain.events;

import java.util.UUID;

public class RegisteredUserEvent implements Event {

    private final UUID id;
    private final String userName;
    private final String password;

    public RegisteredUserEvent(String userName, String password) {
        this.userName = userName;
        this.password = password;
        this.id = UUID.randomUUID();
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public UUID getId() {
        return id;
    }

    @Override
    public String getType() {
        return "RegisteredUser";
    }
}
