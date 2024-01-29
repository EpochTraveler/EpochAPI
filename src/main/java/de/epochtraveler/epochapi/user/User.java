package de.epochtraveler.epochapi.user;

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
     * @param message The message to be sent to the user.
     */
    void sendMessage(String message);

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
