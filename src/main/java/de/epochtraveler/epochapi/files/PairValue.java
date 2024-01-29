package de.epochtraveler.epochapi.files;

/**
 * A record representing a key-value pair for configuring default values in a Config.
 *
 * @param <T> The type of the value.
 */
public record PairValue<T>(String path, T object) {}
