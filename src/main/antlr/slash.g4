grammar slash;

source_file: package_statement import_statement* CLASS ID LBRACE class_content RBRACE;

class_content:;

package_statement: PACKAGE dcol_id SEMI;
import_statement: IMPORT dcol_id SEMI;
dcol_id: ID (DCOLON ID)*;

COMMENT : '/*' .*? '*/' -> skip ;
LINE_COMMENT : '//' ~'\n'* '\n' -> skip ;
WS: (' ' | '\t')+ -> skip;
NL: ('\r' '\n'? | '\n') -> skip;

FLOAT
    :   '-'? INT '.' INT?   // 1.35, 1.35E-9, 0.3, -4.5
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