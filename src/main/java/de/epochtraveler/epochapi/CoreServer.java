package de.epochtraveler.epochapi;

import de.epochtraveler.epochapi.commands.UserCommand;
import de.epochtraveler.epochapi.event.EventListener;
import de.epochtraveler.epochapi.user.User;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;

import java.util.Optional;

public interface CoreServer
{

    /**
     * Retrieves a user object associated with the given player.
     *
     * @param player The player object for which to retrieve the user.
     * @return An Optional containing the user object if found, or an empty Optional if not found.
     */
    Optional<User> fromPlayer(Player player);

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
}
