package de.epochtraveler.epochapi;

import de.epochtraveler.epochapi.event.EventListener;
import de.epochtraveler.epochapi.user.User;
import org.bukkit.event.Event;
import org.bukkit.plugin.java.JavaPlugin;

public final class Core {

    private static CoreServer coreServer;

    public static final String CORE_PREFIX = "§c§lAdministration §7| ";
    public static final String CORE_VERSION = "1.4.0";

    public Core(CoreServer pluginInstance)
    {
        coreServer = pluginInstance;
    }

    public static User getUser(String uuid)
    {
        return coreServer.getUser(uuid);
    }

    public static JavaPlugin getPluginInstance()
    {
        return coreServer.getPluginInstance();
    }

    public static void registerListener(Class<? extends Event> eventClass, EventListener listener)
    {
        coreServer.registerListener(eventClass, listener);
    }

    public static void unregister(Class<? extends Event> eventClass, EventListener listener)
    {
        coreServer.registerListener(eventClass, listener);
    }

}
