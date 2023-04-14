package de.epochtraveler.epochapi.database.entry;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;

public interface DatabaseResult {

    /**
     * Gets all found entries for the query
     * @return List<DatabaseEntry>
     */
    List<DatabaseEntry> getResults();

    /**
     * Checks if the query has a result
     * This can be used with lambda integrations
     * @return Optional<Void>
     */
    Optional<Boolean> hasResult();

    /**
     * Gets all found entries for the query which are saved in a row
     * @return HashMap<Integer, DatabaseEntry>
     */
    HashMap<Integer, DatabaseEntry> getRowResult();
}
