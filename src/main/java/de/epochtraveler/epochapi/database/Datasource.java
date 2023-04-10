package de.epochtraveler.epochapi.database;

/**
 * Creates a new Datasource instance object which contains getters
 * @param hostname String
 * @param username String
 * @param password String
 * @param database String
 * @param port int
 */
public record Datasource(
    String hostname,
    String username,
    String password,
    String database,
    int port
) {
    /**
     * Returns the connection string for the datasource
     * @return String
     */
    public String getConnectionString()
    {
        return String.format("jdbc:mysql://%s:%x/%s", hostname, port, database);
    }
}
