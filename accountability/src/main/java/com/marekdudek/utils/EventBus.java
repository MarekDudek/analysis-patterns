package com.marekdudek.utils;

import java.util.*;

public class EventBus implements Observer {

    private final List<Object> events = new ArrayList<>();

    @Override
    public void update(final Observable sender, final Object event) {
        events.add(event);
    }

    public List<Object> events() {
        return Collections.unmodifiableList(events);
    }
}
