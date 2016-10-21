package com.github.kmruiz.workshops.domain;

import com.github.kmruiz.workshops.domain.events.RegisteredUserEvent;
import com.github.kmruiz.workshops.infrastructure.IRegistry;

public class UserService {
    private IRegistry registry;

    public UserService(IRegistry registry) {
        this.registry = registry;
    }

    public RegisteredUserEvent createRegisteredUser(RegistableUser user) {
        RegisteredUserEvent event = user.createRegisteredUser("password");
        registry.save(event);
        return event;
    }
}
