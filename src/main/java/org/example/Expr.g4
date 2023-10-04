grammar Expr;

LEFT: '(';
RIGHT: ')';

MAIN: 'main';
INT: 'int';
CHAR: 'char';
VOID: 'void';
FLOAT: 'float';
STRING: 'string';
RETURN: 'return';

ID : [a-zA-Z]+ ;
INTNUMBER: [0-9]+;
LEFTBRACE: '{';
RIGHTBRACE: '}';

SEMICOLON: ';';
COMA: ',';

EQUAL: '=';
PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';

WS: [ \t\n\r\f]+->skip;


program: function EOF;

function: typesfunction ID
LEFT params* RIGHT
LEFTBRACE staments*  RIGHTBRACE;
endbody:RETURN (ID|INTNUMBER) SEMICOLON;

params: param (COMA param)*;
param: typesparam ID;

statement: typesparam ID SEMICOLON|endbody;

staments: statement
    | (param | INTNUMBER| ID) operatation SEMICOLON
    | ID numbersOperation SEMICOLON
    ;

operatation: operationToken (ID | INTNUMBER);
numbersOperation:
    PLUS PLUS
    |MINUS MINUS
    |(PLUS|MINUS) EQUAL INTNUMBER
    |(MULT|DIV) EQUAL INTNUMBER ;

operationToken: PLUS | MINUS | MULT | DIV | EQUAL;
typesfunction: VOID | typesparam;
typesparam: INT | CHAR | FLOAT | STRING;
