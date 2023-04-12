package de.epochtraveler.epochapi.database.entity;

import de.epochtraveler.epochapi.database.table.Table;

public interface DatabaseEntity  {

    /**
     * Get the assigned table object for the Entity
     * @return Table
     */
    Table getTable();

}
