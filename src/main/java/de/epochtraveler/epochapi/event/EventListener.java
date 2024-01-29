package de.epochtraveler.epochapi.event;

import org.bukkit.event.Event;

/**
 * A functional interface for handling events of a specific type.
 *
 * @param <T> The type of event this listener handles.
 */
public interface EventListener<T extends Event> {

    /**
     * Handles the specified event.
     *
     * @param event The event to handle.
     */
    void handle(T event);
}