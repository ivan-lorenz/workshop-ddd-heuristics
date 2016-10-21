package com.github.kmruiz.workshops.domain.events;

import java.util.UUID;

public interface Event {
    public UUID getId();
    public String getType();
}
