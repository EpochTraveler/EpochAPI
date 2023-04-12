package de.epochtraveler.epochapi.database.column;

public class Column {

    private String identifier;
    private ColumnType type;
    private int length;

    /**
     * Creates a new Column with the maximum column type size
     * @param identifier String
     * @param type ColumnType
     */
    public Column(String identifier, ColumnType type) {
        this.identifier = identifier;
        this.type = type;
    }

    /**
     * Creates a new Column with a specific column type size
     * @param identifier String
     * @param type ColumnType
     * @param length int
     */
    public Column(String identifier, ColumnType type, int length) {
        this.identifier = identifier;
        this.type = type;
        this.length = length;
    }

    /**
     * Get the column name
     * @return String
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Set the column type
     * @param type ColumnType
     */
    public void setType(ColumnType type) {
        this.type = type;
    }

    /**
     * Set the column name
     * @param identifier String
     */
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * Get the Column type
     * @return ColumnType
     */
    public ColumnType getType() {
        return type;
    }

    /**
     * Set the column length
     * @param length int
     */
    public void setLength(int length) {
        this.length = length;
    }

    /**
     * Get the column length
     * @return int
     */
    public int getLength() {
        return length;
    }

}
