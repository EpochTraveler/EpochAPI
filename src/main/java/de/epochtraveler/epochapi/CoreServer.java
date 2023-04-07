package de.epochtraveler.epochapi;

import de.epochtraveler.epochapi.user.User;
import org.bukkit.plugin.java.JavaPlugin;

public interface CoreServer
{

    JavaPlugin getJavaInstance();

    User getUser(String uuid);

}
