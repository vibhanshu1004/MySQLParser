package com.example.java;

import com.example.java.parser.MyDBBaseListener;
import com.example.java.parser.MyDBParser;

import java.util.*;

public class MyDBListenerImpl extends MyDBBaseListener {
    private static final Database db = new Database();

    @Override
    public void exitCreateStatement(MyDBParser.CreateStatementContext ctx) {
     String tableName = ctx.tblName.getText();

     List<String> columns = new ArrayList<>();
     List<String> colTypes = new ArrayList<>();

     for (MyDBParser.ColumnDefContext colCtx : ctx.columnDef()) {
        columns.add(colCtx.colName.getText());
        colTypes.add(colCtx.colType.getText());
     }

    db.createTable(tableName, columns, colTypes); // ✅ Use this now
}

    @Override
    public void exitInsertStatement(MyDBParser.InsertStatementContext ctx) {
        String tableName = ctx.tblName.getText();
        List<String> values = new ArrayList<>();
        for (var str : ctx.valueList().STRING()) {
            String raw = str.getText(); // includes single quotes
            values.add(raw.substring(1, raw.length() - 1)); // remove single quotes
        }
        db.insertInto(tableName, values);
    }

    @Override
    public void exitSelectStatement(MyDBParser.SelectStatementContext ctx) {
        String tableName = ctx.tblName.getText();
        List<String> columns = new ArrayList<>();
        for (var id : ctx.columnNameList().IDENTIFIER()) {
            columns.add(id.getText());
        }
        db.selectFrom(tableName, columns);
    }
}