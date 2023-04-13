package de.epochtraveler.epochapi.ranks;

import de.epochtraveler.epochapi.permissions.Permission;

import java.util.List;

public interface Group {

    /**
     * Get the id of the group
     * @return String
     */
    String getGroupId();

    /**
     * Get the name of the group
     * @return String
     */
    String getName();

    /**
     * Get the prefix of the group
     * @return String
     */
    String getPrefix();

    /**
     * Get the priority of the group
     * @return int
     */
    int getPriority();

    /**
     * Get the assigned permissions of the group
     * @return List<Permission>
     */
    List<Permission> getPermissions();


}
