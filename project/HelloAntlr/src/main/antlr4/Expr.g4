grammar Expr;

/** The start rule; begin parsing here. */
prog:   stat+ ;

stat :  expr NL
     |  ID '=' expr NL
     |  NL
     ;

expr :  expr ('*'|'/') expr
     |  expr ('+'|'-') expr
     |  INT
     |  ID
     |  '(' expr ')'
     ;

ID   :  [a-zA-Z]+ ;             // match identifier
INT  :  [0-9]+ ;                // match integers
NL   :  '\r'? '\n' ;            // return newlines to parser (is end-statement signal)
WS   :  [ \t]+ -> skip ;        // skip whitespace
