package de.epochtraveler.epochapi;

import de.epochtraveler.epochapi.user.IUser;

public final class EpochCore {

    private static ICoreServer coreServer;

    public static final String CORE_PREFIX = "§3Epoch§9Travelers §7| ";

    public EpochCore(ICoreServer pluginInstance) {
        coreServer = pluginInstance;
    }

    public static IUser getUser(String uuid) {
        return coreServer.getUser(uuid);
    }

}
