package de.epochtraveler.epochapi.event;

import org.bukkit.event.Event;

public interface EventListener<T extends Event> {

    /**
     * EventListener which gets executed when event is called
     * @param event Event
     */
    void handle(T event);

}
