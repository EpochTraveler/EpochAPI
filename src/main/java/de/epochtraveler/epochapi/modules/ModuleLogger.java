package de.epochtraveler.epochapi.modules;

import de.epochtraveler.epochapi.Core;
import de.epochtraveler.epochapi.CoreServer;
import de.epochtraveler.epochapi.logging.LogLevel;
import de.epochtraveler.epochapi.logging.Logger;
import org.bukkit.Bukkit;

/**
 * Implementation of the {@link Logger} interface.
 */
public class ModuleLogger implements Logger
{

    private boolean isEnabled;
    private Module module;
    private Class<?> callerClass;

    /**
     * Creates a new Logger object with the functions of the {@link Logger} interface
     * @param module Module
     * @param callerClass Class<?>
     * @param isEnabled boolean
     */
    public ModuleLogger(Module module, Class<?> callerClass, boolean isEnabled)
    {
        this.module = module;
        this.callerClass = callerClass;
        this.isEnabled = isEnabled;
    }

    public ModuleLogger(Module module)
    {
        this(module, null, true);
    }

    public ModuleLogger(Class<?> callerClass)
    {
        this(null, callerClass, true);
    }

    /**
     * Prints the final log message combined with some logic
     * @param msg String
     * @param level LogLevel
     */
    private void log(String msg, LogLevel level)
    {
        if(!isEnabled) return;
        Core.getPluginInstance().getServer().getConsoleSender().sendMessage("§9["+module.getModuleDescription().name()+"]-["+level.name().toUpperCase()+"] >> " + (callerClass == null ? module.getClass().getSimpleName() : callerClass.getSimpleName()) + ".java" + " §7| " + level.getColor() + msg);
    }

    /**
     * Prints a info message
     * @param msg The logging message
     */
    @Override
    public void info(String msg)
    {
        log(msg, LogLevel.INFO);
    }

    /**
     * Prints a warn message
     * @param msg The logging message
     */
    @Override
    public void warn(String msg)
    {
        log(msg, LogLevel.WARN);
    }

    /**
     * Prints a error message
     * @param msg The logging message
     */
    @Override
    public void error(String msg)
    {
        log(msg, LogLevel.ERROR);
    }

    /**
     * Prints a debug message
     * @param msg The logging message
     */
    @Override
    public void debug(String msg)
    {
        log(msg, LogLevel.DEBUG);
    }

    /**
     * Get the logger state
     * @return boolean
     */
    @Override
    public boolean isEnabled()
    {
        return isEnabled;
    }

    /**
     * Toggle the logger
     * @param enabled boolean
     */
    @Override
    public void setEnabled(boolean enabled)
    {
        this.isEnabled = enabled;
    }
}
