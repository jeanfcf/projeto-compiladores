import tablegen.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.*;
import java.util.*;
import java.io.FileWriter;
import java.io.PrintWriter;

class Compilador {
	HashMap<String, Integer> vars = new HashMap<String, Integer>();

	int indiceLabel = 1;

		
		void compile(ParseTree t,PrintWriter gravarArq) {

			String tipo = t.getClass().getSimpleName().replace("Context", "");
			switch (tipo) {
			case "Start": {
				System.out.println("<html>");
				System.out.println("<head>");
				System.out.println("\t<meta charset=\"UTF-8\">");
				System.out.println("\t<meta name=\"viewport\" content=\"width=device-width,initial-scale=1.0\">");
				System.out.println("</head>");
				System.out.println("<body>");
				gravarArq.println("<html>");
				gravarArq.println("<head>");
				gravarArq.println("\t<meta charset=\"UTF-8\">");
				gravarArq.println("\t<meta name=\"viewport\" content=\"width=device-width,initial-scale=1.0\">");
				gravarArq.println("</head>");
				gravarArq.println("<body>");
				for (int c = 0; c < t.getChildCount() - 1; c++) {
					compile(t.getChild(c),gravarArq);
				}
				System.out.println("</body>");
				System.out.println("</html>");
				gravarArq.println("</body>");
				gravarArq.println("</html>");
				return;

			}
			case "Dec": {
				System.out.printf("<table border=\"1\">\n");
				gravarArq.printf("<table border=\"1\">\n");
				int contador = 4;
				while (!t.getChild(contador).getText().equals("}")) {
					compile(t.getChild(contador),gravarArq);
					contador++;
				}
				System.out.printf("</table>\n");
				gravarArq.printf("</table>\n");
				return;
			}

			case "Head": {
				System.out.printf("\t<thead>\n");
				gravarArq.printf("\t<thead>\n");

				return;
			}

			case "Tit": {
				String tituloTab = t.getChild(2).getText();
				System.out.printf("<h3> %s </h3>\n", tituloTab);
				gravarArq.printf("<h3> %s </h3>\n", tituloTab);
				return;
			}

			case "Lab": {
				int c = 3;
				System.out.printf("\t\t<tr>\n");
				gravarArq.printf("\t\t<tr>\n");
				while (!t.getChild(c).getText().equals("]")) {
					String tituloTab = t.getChild(c).getText();
					System.out.printf("\t\t\t<th> %s </th>\n", tituloTab);
					gravarArq.printf("\t\t\t<th> %s </th>\n", tituloTab);
					c += 2;
				}
				System.out.printf("\t\t</tr>\n");
				System.out.printf("\t</thead>\n");
				gravarArq.printf("\t\t</tr>\n");
				gravarArq.printf("\t</thead>\n");
				return;
			}
			case "Foot": {
				System.out.printf("\t<tfoot>\n");
				gravarArq.printf("\t<tfoot>\n");
				return;
			}

			case "Con": {
				int c = 3;
				while (!t.getChild(c).getText().equals("]")) {
					String tituloTab = t.getChild(c).getText();
					System.out.printf("\t\t<td> %s </td>\n", tituloTab);
					gravarArq.printf("\t\t<td> %s </td>\n", tituloTab);
					c += 2;
				}
				System.out.printf("\t</tfoot>\n");
				gravarArq.printf("\t</tfoot>\n");
				return;
			}

			case "Coluna": {
				int numeroColunas = Integer.parseInt(t.getChild(2).getText());
				vars.put("columns", numeroColunas);
				return;
			}
			case "Linha": {
				int qtdLinhas = Integer.parseInt(t.getChild(2).getText());
				int qtdColunas = vars.get("columns");
				System.out.println("\t<tbody>");
				gravarArq.println("\t<tbody>");
				for (int i = 0; i < qtdColunas; i++) {
					System.out.println("\t\t<tr>");
					gravarArq.println("\t\t<tr>");
					for (int j = 0; j < qtdLinhas; j++) {
						System.out.println("\t\t\t<td> Preencha aqui! </td>");
						gravarArq.println("\t\t\t<td> Preencha aqui! </td>");
					}
					System.out.println("\t\t</tr>");
					gravarArq.println("\t\t</tr>");
				}
				System.out.println("\t</tbody>");
				gravarArq.println("\t</tbody>");
				return;
			}

			default:
				System.out.printf("Nao sei compilar %s ainda\n", t.getText());
			}
			

		}





}