package de.epochtraveler.epochapi.modules;

import de.epochtraveler.epochapi.CoreServer;

import java.util.Objects;

public abstract class Module {

    private static CoreServer coreServer;
    private final ModuleDescription moduleDescription;
    private final ModuleLogger moduleLogger;

    /**
     * Creates a new Module instance
     * @param server CoreServer instance
     */
    public Module(CoreServer server)
    {
        coreServer = server;
        this.moduleDescription = Objects.requireNonNull(getClass().getAnnotation(ModuleDescription.class),
                "ModuleDescription is missing!");
        this.moduleLogger = new ModuleLogger(this);
    }

    /**
     * This method is getting called, when the Module gets loaded on startup.
     */
    public abstract void enable();

    /**
     * This method is getting called, when the Module gets disabled when reloading or closing the server.
     */
    public abstract void disable();

    /**
     * Get the module description class ${{@link ModuleDescription}}
     * @return ModuleDescription object
     */
    public ModuleDescription getModuleDescription() {
        return moduleDescription;
    }

    /**
     * Get the module logger of the current module
     * @return ModuleLogger Instance
     */
    public ModuleLogger getModuleLogger() {
        return moduleLogger;
    }
}
