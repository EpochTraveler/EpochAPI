package de.epochtraveler.epochapi.user;

import net.kyori.adventure.text.Component;
import org.bukkit.entity.Player;

/**
 * A representation of a user in the system.
 */
public interface User {

    /**
     * Returns the player's unique identifier (UUID).
     *
     * @return The player's unique identifier as a String.
     */
    String uniqueId();

    /**
     * Returns the player's username.
     *
     * @return The player's username as a String.
     */
    String username();

    /**
     * Sends a message to the user.
     *
     * @param component The message component sent to the user.
     */
    void sendMessage(Component  component);

    /**
     * Gets the associated Bukkit Player instance, if available.
     *
     * @return The associated Bukkit Player instance, or null if not available.
     */
    Player bukkitPlayer();

    /**
     * Checks if the user is currently online.
     *
     * @return True if the user is online, false otherwise.
     */
    boolean isOnline();
}
