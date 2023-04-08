package de.epochtraveler.epochapi;

import de.epochtraveler.epochapi.event.EventListener;
import de.epochtraveler.epochapi.user.User;
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
    User getUser(String uuid);

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

}
