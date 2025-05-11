package de.epochtraveler.epochapi.user.model;

/**
 * A representation of a user in the system.
 */
public interface User {

    /**
     * Returns the player's unique identifier.
     *
     * @return The player's unique identifier as a string.
     */
    String uniqueId();

    /**
     * Returns the player's username.
     *
     * @return The player's username as a string.
     */
    String username();



}
