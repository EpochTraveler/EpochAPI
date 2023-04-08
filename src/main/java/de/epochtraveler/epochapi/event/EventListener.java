package de.epochtraveler.epochapi.event;

import org.bukkit.event.Event;

public interface EventListener<T extends Event> {

    void handle(T event);

}
