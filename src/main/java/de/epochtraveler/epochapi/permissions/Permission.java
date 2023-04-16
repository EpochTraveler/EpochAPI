package de.epochtraveler.epochapi.permissions;

public interface Permission {

    /**
     * Get the permission key
     * @return String
     */
    String getPermission();

    /**
     * Creates a new permission
     * @param name String
     * @return boolean
     */
    boolean createPermission(String name);

}
