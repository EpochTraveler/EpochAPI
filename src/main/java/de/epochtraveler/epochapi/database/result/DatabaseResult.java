package de.epochtraveler.epochapi.database.result;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public interface DatabaseResult {

    /**
     * Checks if the Query has found ANY values
     * @return boolean
     */
   Optional<List<RowResult>> hasResult();




}
