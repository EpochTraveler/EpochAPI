package de.epochtraveler.epochapi.database.column;

public class Column {

    private String identifier;
    private ColumnType type;
    private int length;

    public Column(String identifier, ColumnType type) {
        this.identifier = identifier;
        this.type = type;
    }

    public Column(String identifier, ColumnType type, int length) {
        this.identifier = identifier;
        this.type = type;
        this.length = length;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setType(ColumnType type) {
        this.type = type;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public ColumnType getType() {
        return type;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

}
