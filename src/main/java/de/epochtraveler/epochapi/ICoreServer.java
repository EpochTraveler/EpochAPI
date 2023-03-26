package de.epochtraveler.epochapi;

import de.epochtraveler.epochapi.user.IUser;
import org.bukkit.plugin.java.JavaPlugin;

public interface ICoreServer {

    JavaPlugin getInstance();

    IUser getUser(String uuid);

}
