package de.epochtraveler.epochapi;

import de.epochtraveler.epochapi.api.LocalInterface;
import de.epochtraveler.epochapi.commands.UserCommand;
import de.epochtraveler.epochapi.event.EventListener;
import de.epochtraveler.epochapi.user.User;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextColor;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;

import java.util.Optional;

/**
 * Implementation of the {@link CoreServer} interface
 */
@LocalInterface(
        version = "2.0.1",
        name = "Core-API"
)
public final class Core {

    private static CoreServer core;

    public Core(CoreServer provider)
    {
        core = provider;
    }

    public static void registerListener(Class<? extends Event> eventClass, EventListener listener)
    {
        core.registerListener(eventClass, listener);
    }

    public static void unregister(Class<? extends Event> eventClass, EventListener listener)
    {
        core.registerListener(eventClass, listener);
    }

    public static void registerCommand(UserCommand playerCommand)
    {
        core.registerCommand(playerCommand);
    }

    public static Optional<User> fromPlayer(Player player)
    {
        return core.fromPlayer(player);
    }

    public static LocalInterface localInterface()
    {
        if(Core.class.getAnnotation(LocalInterface.class) == null) return null;
        return Core.class.getAnnotation(LocalInterface.class);
    }

}
