package de.epochtraveler.epochapi.logging;

public interface Logger {

    /**
     * Logs a message with the info-level
     * @param msg The logging message
     */
    void info(String msg);

    /**
     * Logs a message with the warn-level
     * @param msg The logging message
     */
    void warn(String msg);

    /**
     * Logs a message with the error-level
     * @param msg The logging message
     */
    void error(String msg);

    /**
     * Logs a message with the debug-level
     * @param msg The logging message
     */
    void debug(String msg);

    /**
     * Returns if the logger is enabled
     * @return boolean
     */
    boolean isEnabled();

    /**
     * Toggle the logger
     * @param enabled boolean
     */
    void setEnabled(boolean enabled);

}
