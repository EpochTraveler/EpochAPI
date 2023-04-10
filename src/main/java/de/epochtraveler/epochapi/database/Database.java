package de.epochtraveler.epochapi.database;

import de.epochtraveler.epochapi.database.entry.DatabaseResult;

public interface Database {

    /**
     * Create a new execute sql query
     * @param sql String
     * @return boolean
     */
    boolean executeQuery(String sql);

    /**
     * Creates a new selection sql query
     * @param sql String
     * @return DatabaseResult
     */
    DatabaseResult createQuery(String sql);

}
