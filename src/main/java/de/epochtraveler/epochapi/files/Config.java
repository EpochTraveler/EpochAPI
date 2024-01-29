package de.epochtraveler.epochapi.files;

import de.epochtraveler.epochapi.logging.Logger;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 * An interface for managing configuration files.
 */
public interface Config {

    /**
     * Gets the file object of the current config file.
     *
     * @return Config file
     */
    File getConfigFile();

    /**
     * Gets the YamlConfiguration object of the current config file.
     *
     * @return Config file
     */
    YamlConfiguration getConfiguration();

    /**
     * Adds default values to the config file if they don't exist.
     *
     * @param values PairValue objects representing path-value pairs
     */
    default void addDefaults(PairValue<?>... values) {
        Arrays.stream(values).forEach(pairValue -> {
            if (getConfiguration().get(pairValue.path()) != null)
                return;
            getConfiguration().set(pairValue.path(), pairValue.object());
            save();
        });
    }

    /**
     * Saves the current configuration into the file.
     *
     * @return True if the save operation was successful, false otherwise.
     */
    default boolean save() {
        try {
            getConfiguration().save(getConfigFile());
            return true;
        } catch (IOException exception) {
            getLogger().error("Unable to save file: " + getConfigFile().getName());
            getLogger().error(exception.getMessage());
            return false;
        }
    }

    /**
     * Sets an object value at the specified path.
     *
     * @param path  The path in the configuration
     * @param value The value to set
     */
    void set(String path, Object value);

    /**
     * Retrieves an object from the given path.
     * If you need more specific getters (e.g., getString), implement them in the implementation class.
     *
     * @param <T>  The type of the object to retrieve
     * @param path The path in the configuration
     * @return The retrieved object
     */
    <T> T get(String path);

    /**
     * Gets the current instance of the Config object.
     *
     * @return Config instance
     */
    Config getConfig();

    /**
     * Gets the logger instance associated with this Config.
     *
     * @return Logger instance
     */
    Logger getLogger();
}