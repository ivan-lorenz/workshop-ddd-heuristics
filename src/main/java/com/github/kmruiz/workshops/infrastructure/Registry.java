package com.github.kmruiz.workshops.infrastructure;

import com.github.kmruiz.workshops.domain.events.RegisteredUserEvent;

import java.util.ArrayList;
import java.util.List;

public class Registry implements IRegistry<Registry.UserRow> {

    class UserRow {
        private final String id;
        private final String name;
        private final String password;

        UserRow(String id, String name, String password) {
            this.id = id;
            this.name = name;
            this.password = password;
        }
    }

    private List<UserRow> userTable = new ArrayList<UserRow>();

    @Override
    public void save(RegisteredUserEvent event) {
        UserRow row = new UserRow(event.getId(), event.getUserName(), event.getPassword());
        userTable.add(row);
    }

    @Override
    public List<UserRow> getState() {
        return userTable;
    }


}
