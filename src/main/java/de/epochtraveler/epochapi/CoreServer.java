package de.epochtraveler.epochapi;

import de.epochtraveler.epochapi.commands.PlayerCommand;
import de.epochtraveler.epochapi.database.Database;
import de.epochtraveler.epochapi.event.EventListener;
import de.epochtraveler.epochapi.user.User;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.plugin.java.JavaPlugin;

public interface CoreServer
{

    /**
     * Returns the JavaPluginInstance from the core plugin
     * @return JavaPlugin
     */
    JavaPlugin getPluginInstance();

    /**
     * Gets a user object from the given uuid
     * @return User object
     * TODO: Automatically returns an online or offline user.
     */
    User getUser(Player player);

    /**
     * Registers a listener
     * @param clazz Event class
     * @param listener EventListener class Object
     */
    void registerListener(Class<? extends Event>  clazz, EventListener listener);

    /**
     * Unregister a listener
     * @param clazz Event class
     * @param listener EventListener class Object
     */
    void unregisterListener(Class<? extends Event>  clazz, EventListener listener);

    /**
     * Registers a command
     * @param command PlayerCommand
     */
    void registerCommand(PlayerCommand command);

    /**
     * Use the DatabaseService to access database implementations
     * @return Database
     */
    Database createDatabaseService();


    /**
     * Creates a new permission
     * @param name String
     * @return boolean
     */
    boolean createPermission(String name);
}
