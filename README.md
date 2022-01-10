# Criação de uma tabela HTML a partir de uma linguagem de domínio específico

### 1. Equipe do projeto
  - Bruno de Lima Cavalcanti
  - Jean Felipe Coelho Ferreira
  - Julia Simone Araujo da Silva
  - Lucas Matheus da Silva Oliveira
  - Victor Guilherme Pereira Pimentel de Barros

### 2. Motivação

Criamos uma linguagem própria que serve como base para construção de um compilador capaz de converter o código gerado em um arquivo HTML, além da disponibilização da tabela no console, com os componentes de estrutura semi-prontos, como: header, footer e as respectivas células. 

  >O uso desse gerador de tabela em HTML facilita o dia a dia de desenvolvedores em ter a praticidade de gerar tabelas pré prontas na construção de seus códigos.

### 3. Exemplos da Linguagem e do Resultado Esperado

  #### **Construção de uma entrada:**
  ```
  table: string {
    header = boolean,  
    labels = ["string", "string","string", ... ],
    columns = int,
    rows = int,
    footer = boolean,
    contentFooter = ["string","string","string", ... ],
  }
  ```

  #### **Exemplo:**

  - ##### **Entrada:**

  ```String
  table: jean {
  header = true,  
  labels = ["titulo1", "titulo2",],
  columns = 2,
  rows = 2,
  footer = true,
  contentFooter = ["footer1","footer2",],
  };
  ```

  - ##### **Saída:**

  ```HTML
 <html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width,initial-scale=1.0">
</head>
<body>
<table border="1">
    <thead>
        <tr>
            <th> "titulo1" </th>
            <th> "titulo2" </th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td> Preencha aqui! </td>
            <td> Preencha aqui! </td>
        </tr>
        <tr>
            <td> Preencha aqui! </td>
            <td> Preencha aqui! </td>
        </tr>
        <tr>
            <td> Preencha aqui! </td>
            <td> Preencha aqui! </td>
        </tr>
    </tbody>
    <tfoot>
        <td> "footer1" </td>
        <td> "footer2" </td>
    </tfoot>
</table>
</body>
</html>

  ```

### 4. Gramática da Linguagem

  ```
start : dec* com* EOF ; 

dec : 'table' ':' VAR '{' columns rows title? header? labels? footer? content? '}' PV ;

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
  ```
### 5. Regras de Sintaxe
 - A ordem dos atributos deve seguir a **Construção de uma entrada**.
 - ```columns``` e ```rows``` são obrigatórios, ```header``` e ```footer``` são opcionais.
 - Se ```header = true``` só irá gerar o header se fornecido ```labels```;
 - Se ```footer = true``` só irá gerar o footer se fornecido ```contentFooter```;
 - Se existir ```labels``` : Nº de Colunas = Nº Labels;
 - Se existir ```contentFooter``` : Nº de Colunas = Nº contentFooter;
 - Nº de Linhas deve ser no mínimo 1;
 - Nº de Colunas deve ser no mínimo 1.



### 6. Manual de uso

  1. Abrir o arquivo teste.tableGen;
  2. Criar o input seguindo as regras de sintaxe;
  3. Escolha a IDE de sua preferência, adicione o antlr.jar ao CLASSPATH;
  4. Execute o arquivo compile.sh;
  5. Rode o arquivo Main.java na IDE escolhida;
  4. Ao concluir a execução, todo o código gerado estará disponível no console e um arquivo HTML será gerado.
  