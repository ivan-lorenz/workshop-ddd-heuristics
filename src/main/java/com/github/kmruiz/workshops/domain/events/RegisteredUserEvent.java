package com.github.kmruiz.workshops.domain.events;

import java.util.UUID;

public class RegisteredUserEvent implements Event {

    private final UUID eventId;
    private final String id;
    private final String userName;
    private final String password;

    public RegisteredUserEvent(String id, String userName, String password) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.eventId = UUID.randomUUID();
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public UUID getEventId() {
        return eventId;
    }

    @Override
    public String getType() {
        return "RegisteredUser";
    }

    public String getId() {
        return id;
    }
}
