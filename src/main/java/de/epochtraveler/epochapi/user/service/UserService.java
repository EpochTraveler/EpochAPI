package de.epochtraveler.epochapi.user.service;

import de.epochtraveler.epochapi.user.model.OfflineUser;
import de.epochtraveler.epochapi.user.model.OnlineUser;
import de.epochtraveler.epochapi.user.model.User;

import java.util.Optional;

public interface UserService {

    /**
     * Returns a {@link User} instance for the given UUID in string form.
     * <p>
     * If the user is currently online, an {@link OnlineUser} will be returned.
     * Otherwise, an {@link OfflineUser} will be returned.
     *
     * @param uniqueId the UUID in string form of the user
     * @return the {@code User} instance (online or offline)
     */
    Optional<User> findUserByUniqueId(String uniqueId);

    /**
     * Returns a {@link User} instance for the given username.
     * <p>
     * If the user is currently online, an {@link OnlineUser} will be returned.
     * Otherwise, an {@link OfflineUser} will be returned.
     *
     * @param username the name of the user
     * @return the {@code User} instance (online or offline)
     */
    Optional<User> findUserByName(String username);

}
