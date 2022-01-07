# Criação de um padrão de projeto(design pattern) - singleton - com finalidade de comunicação com um banco de dados a partir de uma linguagem de domínio específico

### 1. Equipe do projeto

  - Jean Felipe Coelho Ferreira
  - Lucas Matheus da Silva Oliveira

### 2. Motivação

  Para simplificar a construção de um código java capaz de se comunicar com um banco de dados e que ao mesmo tempo seja um singleton, criaremos uma linguagem que facilitará a construção destes código e um compilador capaz de converter o código gerado a partir desta linguagem em um singleton com os métodos prontos.
  #### O Singleton é um padrão de projeto que tem como objetivo a solução de dois problemas de uma aplicação:
  - Garantir que uma classe tenha somente uma instância no programa - Mais comum em programas que acessam recursos compartilhados, como bases de dados, sistemas de arquivos, interfaces gráficas, spoolers de impressão, módulos de um programa e entre outos.
  - Fornecer um ponto de acesso global para a mesma - Assemelha o singleton com variáveis globais, porque possuimos um único objeto, com acesso global, que pode ser usado em várias partes da aplicação.
  - Mesmo sendo um dos padrões com maior uso atualmente, requer muito conhecimento e cuidado quando for utilizar. Um programador facilmente cria um Singleton que pode acabar gerando problemas de concorrência dentro do programa.

### 3. Exemplos da Linguagem e do Resultado Esperado

  #### **A linguagem foi definida através da estrutura abaixo, onde por exemplo:**

 - **Tabela:** tabelaBanco = nomeTabela&
 - **Classe:** classeModel = nomeClasse&
 - **Colunas:** colunasTabela = nomeColuna(tipoColuna) outraColuna(tipoColuna)&
 - **Método:** metodoSQL = TIPOMETODO

  #### **Construção de uma entrada:**

  ```
  tabelaBanco = tabela&
  classeModel = classe&
  colunasTabela = coluna(int) outracoluna(double)&
  metodoSQL = INSERT
  ```

  #### **Exemplo:**

  - ##### **Entrada:**

  ```String
    tabelaBanco = usuarios&
    classeModel = User&
    colunasTabela = cpf(int) nome(double)&
    metodoSQL = INSERT
  ```

  - ##### **Saída:**

  ```java
  public interface User {
    int getCpf();
    double getNome();
    int setCpf();
    double setNome();
  }

  public class UserModel implements User {
    private int cpf;
    private double nome;
    public int setCpf(int cpf) {
      this.cpf = cpf;
    }
    public double setNome(double nome) {
      this.nome = nome;
    }
    public int getCpf(int cpf) {
      this.cpf = cpf;
    }
    public double getNome(double nome) {
      this.nome = nome;
    }
  }

  public class MyDatabaseSingleton {

    private static MyDatabaseSingleton instance ;
    public String value;
    private List<UserModel> users = new ArrayList<>();

    private MyDatabaseSingleton(String value) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static MyDatabaseSingleton getInstance(String value ) {
        if (this.instance == null) {
            this.instance = new MyDatabaseSingleton(value);
        }
        return this.instance;
    }

    public static void insertBanco(int cpf,double nome) {
      try {
          stmt = con.conectar().createStatement();
          rs = stmt.executeQuery('INSERT');
          UserModel p = new UserModel(cpf,nome);
          rs.create(p,usuarios)
          this.users.add(p)
      } catch (ClassNotFoundException | SQLException e) {
          e.printStackTrace();
          return null;
      } finally {
          try {
              stmt.close();
              rs.close();
          } catch (SQLException e) {
              e.printStackTrace();
          }
      }
    }
    public static void add(UserModel user) {
        this.users.add(user);
    }
  }
  ```

### 4. Gramática da Linguagem

  ```
    Start = Tabela+
    Classe = "classeModel = " nomeClasse "&" Colunas 
    Colunas = "colunasTabela = "(nomeColuna "(" tipos ")")+ "&" Metodos
    Tabela = "tabelaBanco = " nomeTabela "&" Classe
    Metodos = "metodoSQL = " tiposMetodos
    tiposMetodos = "INSERT"
        | "SELECT"
        | "DELETE"
    nomeTabela = letter+
    nomeClasse = letter+
    nomeColuna = letter+
    tipos = "String"
        | "int"
        | "double"
        | "boolean" 
  ```

### 5. Descrição do Processo de Geração de Código ou execução

  #### Descrição:
  Nós decidimos gerar o código a partir de um objeto gerado através de uma árvore semântica. De início, nós criamos a semântica e adicionamos uma "operação" na mesma para criar um objeto em um formato adequado através da árvore. 
  Com o objeto criado, nós extraímos suas propriedades e construímos o código de saída.
  Portanto, a saída do nosso programa foi uma interface com os metodos necessarios para implementação da classe modelo, e um singleton contendo as operações com o banco.

### 6. Manual de uso.

  1. Abra o arquivo index.js;
    *- Obs:  Apenas se você estiver executando no replit!*
  2. Aperte o botão Run que aparece na parte superior;
  3. Ao concluir a execução, todo o código gerado estará disponível no console.