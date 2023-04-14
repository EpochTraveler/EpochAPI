package de.epochtraveler.epochapi.database.result;

import java.util.List;
import java.util.Optional;

public interface RowResult {

    /**
     * Gets the Entries in the current row
     * @return
     */
    Optional<List<DatabaseEntry>> getEntry();
    int getRow();

}
