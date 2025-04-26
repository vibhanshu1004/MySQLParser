package com.example.java;

import java.util.*;

public class Database {
    private Map<String, Table> tables = new HashMap<>();

    public void createTable(String name, List<String> columns, List<String> columnTypes) {
        if (tables.containsKey(name)) {
            throw new IllegalArgumentException("Table already exists.");
        }
        tables.put(name, new Table(name, columns, columnTypes));
        System.out.println("Table '" + name + "' created with columns" + columns + "and types" + columnTypes);
    }

    public void insertInto(String tableName, List<String> values) {
        Table table = tables.get(tableName);
        if (table == null) {
            throw new IllegalArgumentException("Table not found: " + tableName);
        }
        table.insert(values);
        System.out.println("Inserted into '" + tableName + "': " + values);
    }

    public void selectFrom(String tableName, List<String> columns) {
        Table table = tables.get(tableName);
        if (table == null) {
            throw new IllegalArgumentException("Table not found: " + tableName);
        }

        table.printTable();
    }

    public boolean tableExists(String name) {
        return tables.containsKey(name);
    }

    public Table getTable(String name) {
        return tables.get(name);
    }
}
