package de.epochtraveler.epochapi;

import de.epochtraveler.epochapi.commands.UserCommand;
import de.epochtraveler.epochapi.event.EventListener;
import de.epochtraveler.epochapi.user.service.UserService;
import org.bukkit.event.Event;

public interface CoreServer
{

    /**
     * Registers a listener for a specific event class.
     *
     * @param clazz The class object representing the type of event to listen for.
     * @param listener The EventListener object to be registered.
     */
    void registerListener(Class<? extends Event>  clazz, EventListener listener);

    /**
     * Unregisters a listener for a specific event class.
     *
     * @param clazz The class object representing the type of event the listener was registered for.
     * @param listener The EventListener object to be unregistered.
     */
    void unregisterListener(Class<? extends Event>  clazz, EventListener listener);

    /**
     * Registers a command to be available for users.
     *
     * @param command The UserCommand object representing the command to be registered.
     */
    void registerCommand(UserCommand command);

    /**
     * Returns the currently assigned {@link UserService} instance.
     * <p>
     * This service provides access to operations for retrieving and managing
     * online and offline users.
     *
     * @return the current {@code UserService} instance
     */
    UserService userService();

}
