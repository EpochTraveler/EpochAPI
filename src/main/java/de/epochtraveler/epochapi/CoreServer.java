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

    void registerListener(Class<? extends Event>  clazz, EventListener listener);
    void unregisterListener(Class<? extends Event>  clazz, EventListener listener);

}
