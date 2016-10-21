package com.github.kmruiz.workshops.domain.events;

import java.util.UUID;

public interface Event {
    public UUID getEventId();
    public String getType();
}
