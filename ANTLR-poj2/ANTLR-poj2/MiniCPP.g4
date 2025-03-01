grammar MiniCPP;

INCLUDE: '#include';
IF: 'if';
ELSE: 'else';
FOR: 'for';
WHILE: 'while';
RETURN: 'return';
INT: 'int';
FLOAT: 'float';
DOUBLE: 'double';
STR: 'string';
VOID: 'void';
ID: [a-zA-Z_][a-zA-Z_0-9]*;
NUMBER: [0-9]+ ('.' [0-9]+)?;
STRING_LITERAL: '"' (~["\r\n])* '"';

LINE_COMMENT: '//' ~[\r\n]* -> skip;
BLOCK_COMMENT: '/*' .*? '*/' -> skip;
WS: [ \t\r\n]+ -> skip;

ASSIGN: '=';
PLUS_ASSIGN: '+=';
MINUS_ASSIGN: '-=';
MULT_ASSIGN: '*=';
DIV_ASSIGN: '/=';
MOD_ASSIGN: '%=';
PLUS: '+';
MINUS: '-';
STAR: '*';
DIV: '/';
MOD: '%';
AND: '&&';
OR: '||';
NOT: '!';
EQUAL: '==';
NOT_EQUAL: '!=';
GREATER_EQUAL: '>=';
LESS_EQUAL: '<=';
GREATER: '>';
LESS: '<';
INCREMENT: '++';
DECREMENT: '--';
SEMICOLON: ';';
DOT: '.';
COMMA: ',';
LPAREN: '(';
RPAREN: ')';
LBRACE: '{';
RBRACE: '}';

program: (
		includeStmt
		| funcDecl
		| varDecl
		| structDecl
		| statement
	)* EOF;

includeStmt: INCLUDE STRING_LITERAL;

varDecl: (INT | FLOAT | DOUBLE | STR) ID (ASSIGN expr)? SEMICOLON;

funcDecl: (INT | FLOAT | DOUBLE | STR | VOID) ID LPAREN paramList? RPAREN block;

paramList: param (COMMA param)*;

param: (INT | FLOAT | DOUBLE | STR) ID;

structDecl:
	'struct' ID LBRACE (
		varDecl
		| funcDecl
		| constructorDecl
		| destructorDecl
		| structDecl
	)* RBRACE SEMICOLON;

statement:
	funcDecl
	| varDecl
	| assignment
	| funcCall SEMICOLON
	| controlStruct
	| returnStmt
	| includeStmt
	| structDecl
	| expr SEMICOLON
	| constDecl;

assignment: ID ASSIGN expr SEMICOLON;

constDecl: 'const' (INT | FLOAT | STR) ID ASSIGN expr SEMICOLON;

constructorDecl: ID LPAREN paramList? RPAREN block;

destructorDecl: '~' ID LPAREN RPAREN block;

funcCall: ID LPAREN (expr (COMMA expr)*)? RPAREN;

controlStruct:
	IF LPAREN expr RPAREN block (ELSE block)?
	| WHILE LPAREN expr RPAREN block
	| FOR LPAREN (varDecl | assignment | expr)? SEMICOLON expr? SEMICOLON (
		assignment
		| expr
	)? RPAREN block;

returnStmt: RETURN expr? SEMICOLON;

block: LBRACE statement* RBRACE;

expr:
	expr (PLUS | MINUS | STAR | DIV | MOD) expr
	| expr (
		GREATER
		| GREATER_EQUAL
		| LESS
		| LESS_EQUAL
		| EQUAL
		| NOT_EQUAL
	) expr
	| expr AND expr
	| expr OR expr
	| ID
	| NUMBER
	| STRING_LITERAL
	| LPAREN expr RPAREN
	| funcCall;