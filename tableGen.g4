grammar tableGen;

start : dec* com* EOF ; 

dec : 'table' ':' VAR '{' header? labels? columns rows footer? content? '}' PV ;

com : 'show' APAR VAR FPAR PV #Show ;

columns: 'columns' ATRIB NUM VIR? #Coluna;

rows: 'rows' ATRIB NUM VIR? #Linha;

title : 'title' ATRIB STRING VIR? #Tit;

header : 'header' ATRIB TRUE VIR? #Head;

footer : 'footer' ATRIB TRUE VIR? #Foot;

labels : 'labels' ATRIB '[' ( STRING VIR )* ']' VIR? #Lab  ;

content : 'contentFooter' ATRIB '[' ( STRING VIR )* ']' VIR? #Con ;

ATRIB : '=' ;
PV : ';' ;
TRUE : 'true'; 
VAR : [a-z]+ ;
NUM : '-'?[0-9]+ ;
STRING : '"' (~["] | '\\"')* '"' ;
APAR : '(' ;
FPAR : ')' ;
VIR: ',' ;

SPACES : (' '  | '\n' | '\t' | '\r') -> skip;
