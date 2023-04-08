package de.epochtraveler.epochapi.files;

import de.epochtraveler.epochapi.logging.Logger;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 * This config class currently supports the following types:
 * - .yml
 */
public interface Config {

    /**
     * File object of the current config file
     * @return Config file
     */
    File getConfigFile();

    /**
     * YamlConfiguration object of the current config file
     * @return Config file
     */
    YamlConfiguration getConfiguration();

    /**
     * Add Default Pair<b>Values</b>(Path, Object) into the config file if they dont exists.
     * @param values PairValues[]
     */
    default void addDefaults(PairValue<?>... values)
    {
        Arrays.stream(values).forEach(pairValue ->
        {
            if(getConfiguration().get(pairValue.path()) != null)
                return;
            getConfiguration().set(pairValue.path(), pairValue.object());
            save();
        });
    }

    /**
     * Save the current #getConfiguration() into the #getFile() File.
     * @return boolean
     */
    default boolean save()
    {
        try
        {
            getConfiguration().save(getConfigFile());
            return true;
        }
        catch (IOException exception)
        {
            getLogger().error("Unable to save file: " + getConfigFile().getName());
            getLogger().error(exception.getMessage());
            return false;
        }
    }

    /**
     * Save an object(value) into the given path
     * @param path string
     * @param value object
     */
    void set(String path, Object value);

    /**
     * Gets the object from the given path.
     * If you need more getters for example #getString implement it into the implementation
     * @param path String
     * @return T
     * @param <T> Object
     */
    <T> T get(String path);

    /**
     * Current instance of the Object
     * @return Config instance
     */
    Config getConfig();

    Logger getLogger();

}
