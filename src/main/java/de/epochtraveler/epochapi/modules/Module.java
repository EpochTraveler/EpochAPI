package de.epochtraveler.epochapi.modules;

import de.epochtraveler.epochapi.CoreServer;
import de.epochtraveler.epochapi.logging.Logger;
import net.kyori.adventure.text.Component;

import java.util.Objects;

/**
 * A base class for implementing modules in the server.
 */
public abstract class Module implements Logger {

    private static CoreServer coreServer;
    private final ModuleInfo moduleInfo;
    private final Logger logger;

    /**
     * Constructs a new Module instance.
     *
     * @param server The CoreServer instance.
     * @throws NullPointerException if the ModuleInfo annotation is missing.
     */
    public Module(CoreServer server)
    {
        coreServer = server;
        this.moduleInfo = Objects.requireNonNull(getClass().getAnnotation(ModuleInfo.class),
                "ModuleDescription is missing!");
        this.logger = this;
    }

    /**
     * This method is called when the module is being enabled during server startup.
     */
    public abstract void enable();

    /**
     * This method is called when the module is being disabled during server reloading or shutdown.
     */
    public abstract void disable();

    /**
     * Returns the prefix associated with this module for messages or commands.
     *
     * @return The prefix as a Component object.
     */
    public abstract Component prefix();

    /**
     * Retrieves the module information associated with this module.
     *
     * @return The ModuleInfo object representing information about this module.
     */
    public ModuleInfo moduleInfo() {
        return moduleInfo;
    }

}
