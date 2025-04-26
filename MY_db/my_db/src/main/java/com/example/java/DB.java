package com.example.java;

import com.example.java.parser.MyDBLexer;
import com.example.java.parser.MyDBParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class DB {

    // ✅ Main method: starts CLI
    public static void main(String[] args) throws Exception {
        com.example.java.cli.MyDbCli.start();  // start interactive shell
    }

    // ✅ Reusable method for executing any SQL string
    public static void execute(String input) throws Exception {
        // Step 1: ANTLR input stream
        CharStream charStream = CharStreams.fromString(input);

        // Step 2: Lexer
        MyDBLexer lexer = new MyDBLexer(charStream);

        // Step 3: Token stream
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Step 4: Parser
        MyDBParser parser = new MyDBParser(tokens);

        // Step 5: Parse the input using the parse rule (your grammar’s entry point)
        ParseTree tree = parser.parse();

        // Step 6: Walk the tree using your listener
        ParseTreeWalker walker = new ParseTreeWalker();
        MyDBListenerImpl listener = new MyDBListenerImpl();
        walker.walk(listener, tree);

        System.out.println("✅ Executed.");
    }
    
}