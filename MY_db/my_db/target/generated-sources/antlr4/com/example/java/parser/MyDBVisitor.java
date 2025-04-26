// Generated from com/example/java/parser/MyDB.g4 by ANTLR 4.13.1
package com.example.java.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MyDBParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MyDBVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MyDBParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(MyDBParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyDBParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(MyDBParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyDBParser#createStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateStatement(MyDBParser.CreateStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyDBParser#columnDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnDef(MyDBParser.ColumnDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyDBParser#insertStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertStatement(MyDBParser.InsertStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyDBParser#selectStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectStatement(MyDBParser.SelectStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyDBParser#columnNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnNameList(MyDBParser.ColumnNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyDBParser#valueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueList(MyDBParser.ValueListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyDBParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(MyDBParser.TypeNameContext ctx);
}