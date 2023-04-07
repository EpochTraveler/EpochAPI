package de.epochtraveler.epochapi.user;

import de.epochtraveler.epochapi.epoch.Epoch;

public interface User
{

    String getUniqueId();
    String getUsername();
    Epoch getUserEpoch();
}
