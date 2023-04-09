package de.epochtraveler.epochapi.user;

public interface User
{
    /**
     * Gets the player UniqueID (UUID)
     * @return String
     */
    String getUniqueId();

    /**
     * Gets the player name
     * @return String
     */
    String getUsername();

    void sendError();

    void sendMessage(String message);
    void sendMessage(String prefix, String message);

}
