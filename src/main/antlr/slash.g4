grammar slash;

source_file: package_statement import_statement* CLASS ID LBRACE class_member* RBRACE;

class_member:class_attribute|class_method;

class_attribute:visibility? type ID SEMI;
class_method:visibility? STATIC? type ID LPAREN (method_param (COMMA method_param)*)? RPAREN code_frame;
method_param:type ID;
code_frame: LBRACE (instruction)* RBRACE;

instruction
    : expr SEMI #expressionInst
    | IF LPAREN expr RPAREN instruction #ifInst
    | code_frame #codeFrameInst
    ;
expr
    : LPAREN expr RPAREN #encapsulateExpr
    | literal #literalExpr
    | ID #idExpr
    | (expr DOT)? ID LPAREN (expr (COMMA expr)*)? RPAREN #callExpr
    ;

literal
    : INT #intLiteral
    | FLOAT #floatLiteral
    | STRING #stringLiteral
    ;

type: (dot_id | AUTO) QMARK? HASH?;

visibility: PUBLIC | PRIVATE | PROTECTED;

package_statement: PACKAGE dot_id SEMI;
import_statement: IMPORT dot_id SEMI;
dot_id: ID (DOT ID)*;

COMMENT : '/*' .*? '*/' -> skip ;
LINE_COMMENT : '//' ~'\n'* '\n' -> skip ;
WS: (' ' | '\t')+ -> skip;
NL: ('\r' '\n'? | '\n') -> skip;

FLOAT
    :   '-'? INT '.' INT?
    ;
INT :   '0' | [1-9] [0-9]* ;
STRING :  '"' (ESC | ~["\\])* '"' ;
fragment ESC :   '\\' (["\\/bfnrt] | UNICODE) ;
fragment UNICODE : 'u' HEX HEX HEX HEX ;
fragment HEX : [0-9a-fA-F] ;
CLASS: 'class';
PACKAGE: 'package';
LOOP: 'loop';
WHILE: 'while';
FOR: 'for';
IF: 'if';
ELSE: 'else';
BREAK: 'break';
CONTINUE: 'continue';
IMPORT: 'import ';
AUTO: 'auto';
STATIC: 'static';

PUBLIC: 'public';
PROTECTED: 'protected';
PRIVATE: 'private';

RANGE: '..';
ARROW: '->';
CAST: '=>';
DYN_CAST: '=?>';

LPAREN: '(';
RPAREN: ')';
LBRACK: '[';
RBRACK: ']';
LBRACE: '{';
RBRACE: '}';

CMP_LESS: '<';
CMP_LESS_EQ: '<=';
CMP_GREA: '>';
CMP_GREA_EQ: '>=';
LSHIFT: '<<';
RSHIFT: '>>';
EQUALS: '==';
SAME: '===';
NOT_EQUALS: '!=';
NOT_SAME: '!==';

PLUS: '+';
DPLUS: '++';
MINUS: '-';
DMINUS: '--';
MUL: '*';
DIV: '/';
MOD: '%';

AND: '&';
OR: '|';
DAND: '&&';
DOR: '||';
XOR: '^';
NOT: '!';
TILDE: '~';

DOT: '.';
HASH: '#';
QMARK: '?';
DCOLON: '::';
COLON: ':';
SEMI: ';';
COMMA: ',';

ASSIGN: '=';
MUL_ASSIGN: '*=';
DIV_ASSIGN: '/=';
MOD_ASSIGN: '%=';
PLUS_ASSIGN: '+=';
MINUS_ASSIGN: '-=';
LSHIFT_ASSIGN: '<<=';
RSHIFT_ASSIGN: '>>=';
AND_ASSIGN: '&=';
OR_ASSIGN: '|=';
XOR_ASSIGN: '^=';

ID : [a-zA-Z_]+ [a-zA-Z0-9_]* ;