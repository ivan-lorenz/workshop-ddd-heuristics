package com.github.kmruiz.workshops.infrastructure;

import com.github.kmruiz.workshops.domain.events.RegisteredUserEvent;

import java.util.List;

public interface IRegistry<T> {
    void save(RegisteredUserEvent event);
    <T> List<T> getState();
}
