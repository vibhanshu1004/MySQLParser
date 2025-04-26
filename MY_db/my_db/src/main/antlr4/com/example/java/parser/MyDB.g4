grammar MyDB;

parse
    : statement+ EOF
    ;

statement
    : createStatement
    | insertStatement
    | selectStatement
    ;

createStatement
    : 'CREATE' 'TABLE' tblName=IDENTIFIER '(' columnDef (',' columnDef)* ')' ';'
    ;

columnDef
    : colName=IDENTIFIER colType=typeName
    ;

insertStatement
    : 'INSERT' 'INTO' tblName=IDENTIFIER '(' columnNameList ')' 'VALUES' '(' valueList ')' ';'
    ;

selectStatement
    : 'SELECT' columnNameList 'FROM' tblName=IDENTIFIER ';'
    ;

columnNameList
    : IDENTIFIER (',' IDENTIFIER)* 
    ;

valueList
    : STRING (',' STRING)* 
    ;

typeName
    : INT_TYPE
    | VARCHAR_TYPE
    | BOOLEAN_TYPE
    ;

// Token Definitions
IDENTIFIER     : [a-zA-Z_][a-zA-Z_0-9]* ;
STRING         : '\'' (~['\r\n'])* '\'' ;

INT_TYPE       : 'INT' ;
VARCHAR_TYPE   : 'VARCHAR' ;
BOOLEAN_TYPE   : 'BOOLEAN' ;

WS             : [ \t\r\n]+ -> skip ;