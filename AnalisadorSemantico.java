
import tablegen.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.*;
import java.util.*;

class AnalisadorSemantico {
  // Mapeamento NomeVariavel --> Tipo
  Map<String, String> vars = new HashMap<String, String>();

  int nosVisitados = 0;

  // Analisa Comandos e Declaracoes
  boolean analise(ParseTree t) {
    String tipo = t.getClass().getSimpleName().replace("Context", "");
    // System.out.println("Avaliando no do tipo: " + tipo);
    nosVisitados++;
    switch (tipo) {
      case "Start": {
        for (int c = 0; c < t.getChildCount() - 1; c++)
          if (!analise(t.getChild(c)))
            return false;
        return true;
      }
      case "Dec": {
        String tipoD = t.getChild(0).getText();
        String nomeVar = t.getChild(2).getText();

        if (vars.containsKey(nomeVar)) {
          System.err.printf("Tabela %s já declarada\n", nomeVar);
          return false;
        }
        vars.put(nomeVar, tipoD);
        ;
        int contador = 4;
        while (!t.getChild(contador).getText().equals("}")) {
          if (analise(t.getChild(contador))) {
            contador++;
          } else {
            return false;
          }
        }
        return true;

      }
      case "Linha": {
        int numeroLinhas = Integer.parseInt(t.getChild(2).getText());
        if (numeroLinhas < 1) {
          System.err.printf("Numero de linhas invalido\n");
          return false;
        }
        vars.put("rows", "" + numeroLinhas);
        return true;
      }
      case "Coluna": {
        int numeroColunas = Integer.parseInt(t.getChild(2).getText());
        if (numeroColunas < 1) {
          System.err.printf("Numero de colunas invalido\n");
          return false;
        }
        if (vars.containsKey("columns")) {
          if (numeroColunas != Integer.parseInt(vars.get("columns"))) {
            System.err.printf("Numero de colunas diferente do numero de labels\n");
            return false;
          }
        }else{
          vars.put("columns",""+numeroColunas);
        }

        return true;
      }
      case "Tit": {
        return true;
      }
      case "Lab": {
        if (!vars.containsKey("header")) {
          System.err.printf("Nao possui header, por isso nao precisa de labels\n");
          return false;
        }
        int i = 3;
        int contador = 0;
        while (!t.getChild(i).getText().equals("]")) {
          contador++;
          i += 2;
        }
        vars.put("columns", "" + contador);
        return true;
      }

      case "Foot": {
        vars.put("footer", "true");
        return true;
      }
      case "Con": {
        if (!vars.containsKey("footer")) {
          System.err.printf("Nao possui footer, por isso nao precisa de contentFooter\n");
          return false;
        }
        int i = 3;
        int contador = 0;
        while (!t.getChild(i).getText().equals("]")) {
          contador++;
          i += 2;
        }
        if (contador != Integer.parseInt(vars.get("columns"))) {
          System.err.printf("Numero de contentFooter nao corresponde ao numero de colunas\n");
          return false;
        }
        return true;
      }

      case "Head": {
        vars.put("header", "true");
        return true;
      }

      default:
        System.err.println("Nao sei analisar nós: " + tipo);
        return false;

    }
  }

}