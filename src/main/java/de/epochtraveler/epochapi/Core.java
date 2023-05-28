package de.epochtraveler.epochapi;

import de.epochtraveler.epochapi.api.API;
import de.epochtraveler.epochapi.commands.PlayerCommand;
import de.epochtraveler.epochapi.database.Database;
import de.epochtraveler.epochapi.event.EventListener;
import de.epochtraveler.epochapi.user.User;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Implementation of the {@link CoreServer} interface
 */
@API(
        version = "1.9.1",
        name = "Core-API"
)
public final class Core {

    private static CoreServer coreServer;

    public static final String CORE_PREFIX = "§c§lAdministration §7| ";
    public static final String CORE_VERSION = "1.9.1";

    public Core(CoreServer pluginInstance)
    {
        coreServer = pluginInstance;
    }

    public static User getUser(Player player)
    {
        return coreServer.getUser(player);
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

    public static void registerCommand(PlayerCommand playerCommand)
    {
        coreServer.registerCommand(playerCommand);
    }

    public static Database createDatabaseService()
    {
        return coreServer.createDatabaseService();
    }

    public static boolean createPermission(String permission)
    {
        return coreServer.createPermission(permission);
    }
}
