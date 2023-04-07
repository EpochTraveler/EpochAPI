package de.epochtraveler.epochapi;

import de.epochtraveler.epochapi.user.User;

public final class Core {

    private static CoreServer coreServer;

    public static final String CORE_PREFIX = "§c§lAdministration §7| ";

    public Core(CoreServer pluginInstance)
    {
        coreServer = pluginInstance;
    }

    public static User getUser(String uuid)
    {
        return coreServer.getUser(uuid);
    }

}
