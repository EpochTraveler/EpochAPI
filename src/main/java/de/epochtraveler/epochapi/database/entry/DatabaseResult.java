package de.epochtraveler.epochapi.database.entry;

import java.util.List;

public interface DatabaseResult {

    /**
     * Gets all found entries for the query
     * @return List<DatabaseEntry>
     */
    List<DatabaseEntry> getResults();

}
