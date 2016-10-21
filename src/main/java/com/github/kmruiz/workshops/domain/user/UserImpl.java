package com.github.kmruiz.workshops.domain.user;

import com.github.kmruiz.workshops.domain.RegistableUser;
import com.github.kmruiz.workshops.domain.events.RegisteredUserEvent;

public class UserImpl implements User, BanneableUser, RegistableUser {

    private final String id;
    private final String userName;

    public UserImpl(String id, String userName) {
        this.id = id;
        this.userName = userName;
    }

    @Override
    public BannedUser ban() {
        return new BannedUserImpl(this.id);
    }

    @Override
    public RegisteredUserEvent createRegisteredUser(String password) {
        return new RegisteredUserEvent(this.id, this.userName, password);
    }

}
