package de.epochtraveler.epochapi.user;

import de.epochtraveler.epochapi.permissions.Permission;
import de.epochtraveler.epochapi.ranks.Group;
import org.bukkit.entity.Player;

import java.util.List;

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
     * Get all groups which the user is in
     * @return List<Group>
     */
    List<Group> getGroups();

    /**
     * Get all user assigned permissions
     * @return List<Permission>
     */
    List<Permission> getPermissions();

    /**
     * Checks if the user has a certain permission
     * @param permission String
     * @return String
     */
    boolean hasPermission(String permission);

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
