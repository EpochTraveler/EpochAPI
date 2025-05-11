package de.epochtraveler.epochapi.user.model;

import net.kyori.adventure.text.Component;

/**
 * A representation of an online user
 */
public interface OnlineUser extends User {

    /**
     * Send a message to the user
     * @param messageComponent the message component send to the player
     */
    void sendMessage(Component messageComponent);

}
