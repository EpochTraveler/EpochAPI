package de.epochtraveler.epochapi.database.column;

public enum ColumnType {

    /* Numric */
    TINYINT,
    SMALLINT,
    MEDIUMINT,
    INT,
    BIGINT,

    DECIMAL,
    FLOAT,
    DOUBLE,
    REAL,

    BIT,
    BOOLEAN,
    SERIAL,

    /* Date and Time */

    DATE,
    DATETIME,
    TIME,
    TIMESTAMP,
    YEAR,

    /* Text */
    CHAR,
    VARCHAR,
    TINYTEXT,
    TEXT,
    MEDIUMTEXT,
    LONGTEXT,

    BINARY,
    VARBINARY,

    TINYBLOB,
    BLOB,
    MEDIUMBLOB,
    LONGBLOB,

    ENUM,
    SET,

    /* Spatial */

    GEOMETRY,
    POINT,
    LINESTRING,
    POLYGON,
    MULTIPOINT,
    MULITLINESTRING,
    MULTIPOLYGON,
    GEOMETRYCOLLECTION,

    /* JSON */
    JSON;

}
