package com.github.kmruiz.workshops.domain;

import com.github.kmruiz.workshops.domain.events.RegisteredUserEvent;

public interface IUser {
    public RegisteredUserEvent createRegisterdUser(String password);
}
