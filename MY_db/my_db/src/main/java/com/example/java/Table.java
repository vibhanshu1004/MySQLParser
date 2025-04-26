package com.example.java;

import java.util.*;

public class Table {
    private String name;
    private List<String> columns;
    private List<String> columnTypes;
    private List<List<String>> rows;

    public Table(String name, List<String> columns, List<String> columnTypes) {
        this.name = name;
        this.columns = new ArrayList<>(columns);
        this.columnTypes = new ArrayList<>(columnTypes);
        this.rows = new ArrayList<>();
    }

    public void insert(List<String> values) {
        if (values.size() != columns.size()) {
            throw new IllegalArgumentException("Value count doesn't match column count.");
        }
        rows.add(new ArrayList<>(values));
    }

    public void printTable() {
      System.out.println("Table: " + name);

    // Print column headers
      System.out.println(String.join(" | ", columns));

    // Print column types below headers
      System.out.println(String.join(" | ", columnTypes));

    // Print rows
      for (List<String> row : rows) {
        System.out.println(String.join(" | ", row));
      }
    }

    public String getName() {
        return name;
    }

    public List<String> getColumns() {
        return columns;
    }

    public List<List<String>> getRows() {
        return rows;
    }
}
