package de.epochtraveler.epochapi.database.table;

import de.epochtraveler.epochapi.database.column.ColumnType;

import java.util.HashMap;
import java.util.List;

public interface Table {

    /**
     * Gets the table name
     * @return String
     */
    String getTableName();

    /**
     * Gets a list with the statements which are needed to create the table
     * @return HashMap<Integer, String>
     */
    HashMap<Integer, String> getStatements();

    /**
     * Creates a column with the max size for this type.
     * @param name Name of the Column in db
     * @param type DATA_TYPE of the column
     * @return Table
     */
    Table addColumn(String name, ColumnType type);

    /**
     * Creates a column with the max size for this type.
     * @param name Name of the Column in db
     * @param type DATA_TYPE of the column
     * @param length Length of the column
     * @return Table
     */
    Table addColumn(String name, ColumnType type, int length);

}
