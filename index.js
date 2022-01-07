const fs = require('fs');
const ohm = require('ohm-js');

function main(inputs) {
  const grammarCode = fs.readFileSync('./grammatics/grammarCode.ohm');
  const gramatica = ohm.grammar(grammarCode);

  const result = gramatica.match(inputs);
  if (result.succeeded()) {
    console.log("------------------------------------");
    console.log("Entrada válida!");
    console.log("------------------------------------");
  } else {
    console.log("------------------------------------");
    console.log("Entrada inválida!");
    console.log("------------------------------------");
    console.log(result.message);
    console.log("------------------------------------");
  }

  const semantic = gramatica.createSemantics();
  semantic.addOperation('executar', {
    Start(tabela) {
      return tabela.executar()
    },
    Tabela(exp_tabela, nome_tabela, barra, classe) {
      return {
        variavel_tabela: nome_tabela.executar(),
        variavel_classe_local: classe.executar()
      }
    },
    Classe(exp_classe, nome_classe, barra, colunas) {
      return {
        variavel_classe: nome_classe.executar(),
        variavel_coluna_local: colunas.executar()
      }
    },
    Colunas(exp_coluna, nome_coluna, ap, tipo, fp, barra, metodo) {
      return {
        variavel_coluna: nome_coluna.executar(),
        variavel_tipo: tipo.executar(),
        variavel_metodo_local: metodo.executar()
      }
    },
    Metodos(exp_metodo, tipo_metodo) {
      return {
        variavel_metodo: tipo_metodo.executar()
      }
    },
    tiposMetodos(_) {
      return this.sourceString;
    },
    tipos(_) {
      return this.sourceString;
    },
    nomeTabela(_) {
      return this.sourceString;
    },
    nomeClasse(_) {
      return this.sourceString;
    },
    nomeColuna(_) {
      return this.sourceString;
    },
    _terminal() { return this.primitiveValue; }
  });
  const executar = semantic(result).executar();

  var resultado = executar;
  var classe = '';
  var colunas = '';
  var tabelaLocal = '';
  var tipo = '';
  var tipoMetodo = '';

  executar.forEach((tabela) => {
    tipo = tabela.variavel_classe_local.variavel_coluna_local.variavel_tipo;
    colunas = tabela.variavel_classe_local.variavel_coluna_local.variavel_coluna;
    classe = tabela.variavel_classe_local.variavel_classe;
    tabelaLocal = tabela.variavel_tabela;
    tipoMetodo = tabela.variavel_classe_local.variavel_coluna_local.variavel_metodo_local.variavel_metodo;
  });
  imprime(classe, colunas, tipo, tipoMetodo, tabelaLocal)
}
function capitalizeFirstLetter(string) {
  return string.charAt(0).toUpperCase() + string.slice(1);
}

function imprime(classe, colunas, tipo, tipoMetodo, tabelaLocal) {
  console.log("Código");
  console.log("------------------------------------");
  console.log("public interface " + classe + " {");
  for (var i = 0; i < colunas.length; i++) {
    console.log("\t" + tipo[i] + " get" + capitalizeFirstLetter(colunas[i]) + "();");
  }
  for (var i = 0; i < colunas.length; i++) {
    console.log("\t" + tipo[i] + " set" + capitalizeFirstLetter(colunas[i]) + "();");
  }
  console.log("}\n")

  console.log("public class " + classe + "Model implements " + classe + " {")
  for (var i = 0; i < colunas.length; i++) {
    console.log("\tprivate " + tipo[i] + " " + colunas[i] + ";")
  }
  for (var i = 0; i < colunas.length; i++) {
    console.log("\tpublic " + tipo[i] + " set" + capitalizeFirstLetter(colunas[i]) + "(" + tipo[i] + " " + colunas[i] + ") {")
    console.log("\t\tthis." + colunas[i] + " = " + colunas[i] + ";")
    console.log("\t}")
  }
  for (var i = 0; i < colunas.length; i++) {
    console.log("\tpublic " + tipo[i] + " get" + capitalizeFirstLetter(colunas[i]) + "(" + tipo[i] + " " + colunas[i] + ") {")
    console.log("\t\tthis." + colunas[i] + " = " + colunas[i] + ";")
    console.log("\t}")
  }
  console.log("}")

  console.log("public class MyDatabaseSingleton {\n")
  console.log("\tprivate static MyDatabaseSingleton instance ;")
  console.log("\tpublic String value;")
  console.log("\tprivate List<" + classe + "Model> " + classe.toLowerCase() + "s = new ArrayList<>();\n")

  console.log("\tprivate MyDatabaseSingleton(String value) {")
  console.log("\t\ttry {")
  console.log("\t\t\tThread.sleep(1000);")
  console.log("\t\t} catch (InterruptedException ex) {")
  console.log("\t\t\tex.printStackTrace();")
  console.log("\t\t}")
  console.log("\t\tthis.value = value;")
  console.log("\t}\n")

  console.log("\tpublic static MyDatabaseSingleton getInstance(String value ) {")
  console.log("\t\tif (this.instance == null) {")
  console.log("\t\t\tthis.instance = new MyDatabaseSingleton(value);")
  console.log("\t\t}")
  console.log("\t\treturn this.instance;")
  console.log("\t}\n")


  if (tipoMetodo == "SELECT") {
    console.log("\tpublic static void " + tipoMetodo.toLowerCase() + "Banco()");
    console.log("\t\ttry ");
    console.log("\t\t\t" + classe + "Model obj = new " + classe + "Model()");
    console.log("\t\t\tstmt = con.conectar().createStatement()");
    console.log("\t\t\trs = stmt.executeQuery('" + tipoMetodo.toUpperCase() + "')");
    console.log("\t\t\twhile (rs.next()) ");
    for (var i = 0; i < colunas.length; i++) {
      console.log("\t\t\t\tobj.set" + capitalizeFirstLetter(colunas[i]) + "(rs.getString(" + colunas[i] + "," + tabelaLocal + "));")
    }
    console.log("\t\t\t\tthis." + classe.toLowerCase() + "s.add(obj)")
    console.log("\t\t\t}")
    console.log("\t\t\tshow()")
    console.log("\t\t} catch (ClassNotFoundException | SQLException e) {")
    console.log("\t\t\te.printStackTrace();")
    console.log("\t\t\treturn null;")
    console.log("\t\t} finally {")
    console.log("\t\t\ttry {")
    console.log("\t\t\t\tstmt.close();")
    console.log("\t\t\t\trs.close();")
    console.log("\t\t\t} catch (SQLException ")
    console.log("\t\t\t\te.printStackTrace();")
    console.log("\t\t\t}")
    console.log("\t\t}")
    console.log("\t}")

    console.log("\tpublic static void show() {")
    console.log("\t\t" + tipoMetodo.toLowerCase() + "Banco();")
    console.log("\t\tfor(int i = 0; i < this." + classe.toLowerCase() + "s.size(); i++){")
    console.log("\t\t\tSystem.out.println(this." + classe.toLowerCase() + "s.get(i));")
    console.log("\t\t}")
    console.log("\t}")
  } else if (tipoMetodo == "INSERT") {

    var parametros = '';
    var parametrosSemTipo = '';
    for (var i = 0; i < colunas.length; i++) {
      parametros += tipo[i] + " " + colunas[i];
      if (i < colunas.length - 1) {
        parametros += ","
      }
    };

    console.log("\tpublic static void " + tipoMetodo.toLowerCase() + "Banco(" + parametros + ") {")
    console.log("\t\ttry {")
    console.log("\t\t\tstmt = con.conectar().createStatement();")
    console.log("\t\t\trs = stmt.executeQuery('" + tipoMetodo.toUpperCase() + "');")
    console.log("\t\t\t" + classe + "Model p = new " + classe + "Model(" + colunas + ");")
    console.log("\t\t\trs.create(p," + tabelaLocal + ")")
    console.log("\t\t\tthis." + classe.toLowerCase() + "s.add(p)")
    console.log("\t\t} catch (ClassNotFoundException | SQLException e) {")
    console.log("\t\t\te.printStackTrace();")
    console.log("\t\t\treturn null;")
    console.log("\t\t} finally {")
    console.log("\t\t\ttry {")
    console.log("\t\t\t\tstmt.close();")
    console.log("\t\t\t\trs.close();")
    console.log("\t\t\t} catch (SQLException e) {")
    console.log("\t\t\t\te.printStackTrace();")
    console.log("\t\t\t}")
    console.log("\t\t}")
    console.log("\t}")
    console.log("\tpublic static void add(" + classe + "Model " + classe.toLowerCase() + ") {")
    console.log("\t\tthis." + classe.toLowerCase() + "s.add(user);")
    console.log("\t}")

  } else if (tipoMetodo == "DELETE") {

    console.log("\tpublic static void removeBanco("+tipo[0]+" "+colunas[0]+") {")
    console.log("\t\ttry {")
    console.log("\t\t\tstmt = con.conectar().createStatement();")
    console.log("\t\t\trs = stmt.executeQuery('"+tipoMetodo.toUpperCase()+"');")
    console.log("\t\t\twhile (rs.next()) {")
    console.log("\t\t\t\tif(rs.get"+tipo[0]+"("+colunas[0]+") == "+colunas[0]+"){")
    console.log("\t\t\t\t\trs.delete("+colunas[0]+","+tabelaLocal+")")
    console.log("\t\t\t\t\tremove("+colunas[0]+")")
    console.log("\t\t\t\t}")
    console.log("\t\t\t}")
    console.log("\t\t} catch (ClassNotFoundException | SQLException e) {")
    console.log("\t\t\te.printStackTrace();")
    console.log("\t\t\treturn null;")
    console.log("\t\t} finally {")
    console.log("\t\t\ttry {")
    console.log("\t\t\t\tstmt.close();")
    console.log("\t\t\t\trs.close();")
    console.log("\t\t\t} catch (SQLException e) {")
    console.log("\t\t\t\te.printStackTrace();")
    console.log("\t\t\t}")
    console.log("\t\t}")
    console.log("\t}")

    console.log('\tpublic static void remove('+tipo[0]+' '+colunas[0]+') {')
    console.log('\t\tfor(int i = 0; i < this.'+classe.toLowerCase()+'s.size(); i++)')
    console.log('\t\t{')
    console.log('\t\t\t'+classe+'Model p = this.'+classe.toLowerCase()+'s.get(i);')
    console.log('\t\t\tif(p.get'+capitalizeFirstLetter(colunas[0])+'().equals('+colunas[0]+'))')
    console.log('\t\t\t{')
    console.log('\t\t\t\tthis.'+classe.toLowerCase()+'s.remove(p);')
    console.log('\t\t\t\tbreak;')
    console.log('\t\t\t}')
    console.log('\t\t}')
    console.log('\t}')
  }
  console.log("}");
  console.log("------------------------------------");
}

var inputs = `
tabelaBanco = usuarios&
classeModel = User&
colunasTabela = cpf(String) nome(String)&
metodoSQL = INSERT
`;
var inputs2 = `
tabelaBanco = teste&
classeModel = Teste&
colunasTabela = teste(String) testeBoolean(boolean) testeX(int)&
metodoSQL = SELECT
`;
var inputs3 = `
tabelaBanco = pessoas&
classeModel = Pessoa&
colunasTabela = nome(String) idade(int) sexo(String)&
metodoSQL = DELETE
`;

console.log("Primeiro teste");
main(inputs)
console.log("Segundo teste");
main(inputs2)
console.log("Terceiro teste");
main(inputs3)
