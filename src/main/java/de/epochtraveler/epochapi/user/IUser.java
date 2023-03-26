package de.epochtraveler.epochapi.user;

import de.epochtraveler.epochapi.epoch.IEpoch;

public interface IUser {

    String getUniqueId();
    String getUsername();
    IEpoch getUserEpoch();
}
