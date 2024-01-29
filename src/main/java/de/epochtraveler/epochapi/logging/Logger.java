package de.epochtraveler.epochapi.logging;

/**
 * A simple logging interface for outputting messages at different log levels.
 */
public interface Logger {

    /**
     * Logs a message with the info-level.
     *
     * @param msg The logging message.
     */
    void info(String msg);

    /**
     * Logs a message with the warn-level.
     *
     * @param msg The logging message.
     */
    void warn(String msg);

    /**
     * Logs a message with the error-level.
     *
     * @param msg The logging message.
     */
    void error(String msg);

    /**
     * Logs a message with the debug-level.
     *
     * @param msg The logging message.
     */
    void debug(String msg);

}