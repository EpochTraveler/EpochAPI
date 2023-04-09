package de.epochtraveler.epochapi.user;

import org.bukkit.entity.Player;

public interface User
{
    /**
     * Gets the player UniqueID (UUID)
     * @return String
     */
    String getUniqueId();

    /**
     * Gets the player name
     * @return String
     */
    String getUsername();

    /**
     * Send a error message to the user
     */
    void sendError();

    /**
     * Send a message to the user
     */
    void sendMessage(String message);

    /**
     * Send a message with a custom prefix to the user
     */
    void sendMessage(String prefix, String message);

    /**
     * Gets the player object
     * @return Player
     */
    Player getPlayer();

}
