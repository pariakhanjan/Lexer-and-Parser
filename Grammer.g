grammar Grammer;

options {
    backtrack = true;
}

@header{
import org.antlr.runtime.*;
}

@members{
public void print(String text){
System.out.print(text + " ");
}
}


start	:	program EOF
	;

program
    : declist MAIN POPEN PCLOSE block
    ;

declist
    : (dec END_OF_LINE*)* 
    ;

dec
    : vardec
    | funcdec
    ;

type
    : INTKEY
    | FLOATKEY
    | BOOLKEY
    ;

iddec
    : ID ((LSB exp RSB) | (ASSIGN exp))?
    ;

idlist
    : iddec (',' iddec)*
    ;

vardec
    : idlist ':' type SEMICOLON
    ;

funcdec
    : FUN ((ID POPEN paramdecs PCLOSE) | (POPEN paramdecs PCLOSE ':' type)) block END_OF_LINE*
    ;

paramdecs
    : paramdecslist?
    ;

paramdecslist
    : paramdec (',' paramdec)*
    ;

paramdec
    : ID (LSB RSB)? ':' type
    ;

block
    : END_OF_LINE* '{' END_OF_LINE* stmtlist? END_OF_LINE* '}' END_OF_LINE*
    ;

stmtlist
    : stmt*
    ;

stmt
    : RETURN exp SEMICOLON END_OF_LINE*
    | exp SEMICOLON END_OF_LINE*
    | block END_OF_LINE*
    | vardec END_OF_LINE*
    | WHILE POPEN exp PCLOSE stmt END_OF_LINE* 
    | ON POPEN exp PCLOSE '{' cases '}' SEMICOLON END_OF_LINE*
    | FOR POPEN ((exp SEMICOLON exp SEMICOLON exp) | (ID IN ID)) PCLOSE stmt END_OF_LINE*
    | IF POPEN exp PCLOSE stmt elseiflist (ELSE stmt)? END_OF_LINE*
    | PRINT POPEN ID PCLOSE SEMICOLON END_OF_LINE*
    ;

elseiflist
    : (ELSEIF POPEN exp PCLOSE stmt END_OF_LINE*)*
    ;

cases
    : case1*
    ;

case1
    : WHERE const1 ':' stmtlist END_OF_LINE*
    ;

//relopexp
//    : exp (relop exp)* END_OF_LINE*
//    ;

exp
    : simpleExp ((operator | relop | ASSIGN) simpleExp)* END_OF_LINE*
    ;

simpleExp
    : const1
    | lvalue
    | ID POPEN explist? PCLOSE
    | POPEN exp PCLOSE
    | SUB exp
    | NOT exp
    ;
    
operator
    : AND
    | OR
    | SUM
    | SUB
    | MUL
    | DIV
    | REM
    ;

const1
    : INT
    | FLOAT
    | TRUE
    | FALSE
    ;

relop
    : GREATER
    | LOWER
    | NOTEQUAL
    | EQUAL
    | LE
    | GE
    ;

explist
    : exp (',' exp)*
    ;

lvalue
    : ID (LSB exp RSB)?
    ;

ERROR_INT
	:	('1'..'9') ('0'..'9') ('0'..'9') ('0'..'9') ('0'..'9') ('0'..'9') ('0'..'9') ('0'..'9') ('0'..'9') ('0'..'9')+
	|	'0' ('0')+ ('1'..'9') ('0'..'9') ('0'..'9') ('0'..'9') ('0'..'9') ('0'..'9') ('0'..'9') ('0'..'9') ('0'..'9') ('0'..'9')+
	;

INT :		('1'..'9') ('0'..'9')? ('0'..'9')? ('0'..'9')? ('0'..'9')? ('0'..'9')? ('0'..'9')? ('0'..'9')? ('0'..'9')?
	| 	'0'
	|	'0' ('0')+ ('1'..'9') ('0'..'9')? ('0'..'9')? ('0'..'9')? ('0'..'9')? ('0'..'9')? ('0'..'9')? ('0'..'9')? ('0'..'9')?
    ;
    
ERROR_FLOAT
	:	('1'..'9') ('0'..'9') ('0'..'9') ('0'..'9') ('0'..'9') ('0'..'9') ('0'..'9') ('0'..'9') ('0'..'9') ('0'..'9')+ '.' ('0'..'9')+ ('0')*
	|	('0'..'9')+ '.' ('0'..'9')* ('.'('0'..'9')*)+
	;

FLOAT
    :   	('1'..'9') ('0'..'9')? ('0'..'9')? ('0'..'9')? ('0'..'9')? ('0'..'9')? ('0'..'9')? ('0'..'9')? ('0'..'9')? '.' ('0'..'9')+ ('0')*
    	| 	'0.' ('0'..'9')+ ('0')*
    	| 	'.' ('0'..'9')+('0')*
    	|	'0' ('0')+ ('1'..'9') ('0'..'9')? ('0'..'9')? ('0'..'9')? ('0'..'9')? ('0'..'9')? ('0'..'9')? ('0'..'9')? ('0'..'9')? '.' ('0'..'9')+ ('0')*
    ;
    
VOID	:	'void'
	;
	
MAIN	:	'main'
	;
    
INTKEY 	:	'int'
	;
	
FLOATKEY:	'float'
	;
	
BOOLKEY :	'bool'
	;
	
FUN 	:	'fun'
	;
	
TRUE 	:	'True'
	;
	
FALSE 	:	'False'
	;
	
PRINT 	:	'print'
	;
	
RETURN	:	'return'
	;
	
IF	:	'if'
	;
	
ELSE	:	'else'
	;
	
ELSEIF	:	'elseif'
	;
	
WHILE	:	'while'
	;
	
ON	:	'on'
	;
	
WHERE	:	'where'
	;
	
FOR	:	'for'
	;
	
AND	:	'and'
	;
	
OR	:	'or'
	;
	
NOT	:	'not'
	;
	
IN	:	'in'
	;
	
ERROR_OP:	('+'|'-'|'*'|'/'|'%') ('+'|'-'|'*'|'/'|'%')+	
	;

SUM	:	'+'
	;
	
SUB	:	'-'
	;
	
MUL	:	'*'
	;
	
DIV	:	'/'
	;
	
REM	:	'%'
	;	
	
POPEN 	:	'('
	;
	
PCLOSE 	:	')'
	;
	
LSB	:	'['
	;
	
RSB	:	']'
	;

EQUAL 	:	'=' (' ')* '='
	;
		
NOTEQUAL:	'!='
	;
	
LE	:	'<='
	;
	
GE	:	'>='
	;
	
LOWER	:	'<'
	;

GREATER	:	'>'
	;
	
SEMICOLON
	:	';'
	;
	
ERROR_ID:	('A'..'Z'|'0'..'9') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
	;

ID  :	('a'..'z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;
     	
WS  :   ( ' '
        | '\t'
        | '\r'
        ) {$channel=HIDDEN;}
    ;
    
END_OF_LINE
	:	'\n'
	;
    
COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

STRING
    :  '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
    ;

fragment
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UNICODE_ESC
    |   OCTAL_ESC
    ;

fragment
OCTAL_ESC
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UNICODE_ESC
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;
    
ASSIGN	:	'='(' ')*
	;	

OTHER_ERRORS 	:	. { }
	;