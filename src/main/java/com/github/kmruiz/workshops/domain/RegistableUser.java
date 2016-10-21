package com.github.kmruiz.workshops.domain;

import com.github.kmruiz.workshops.domain.events.RegisteredUserEvent;

public interface RegistableUser {
    public RegisteredUserEvent createRegisteredUser(String password);
}
