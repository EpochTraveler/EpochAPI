package de.epochtraveler.epochapi;

import de.epochtraveler.epochapi.user.User;
import org.bukkit.plugin.java.JavaPlugin;

public final class Core {

    private static CoreServer coreServer;

    public static final String CORE_PREFIX = "§c§lAdministration §7| ";
    public static final String CORE_VERSION = "1.3.0";

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

}
