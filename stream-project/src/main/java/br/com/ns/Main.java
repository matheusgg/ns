package br.com.ns;

import java.util.Scanner;

import br.com.ns.search.UnrepeatableCharSearcher;
import br.com.ns.stream.Stream;
import br.com.ns.stream.StreamImpl;

/**
 * Classe principal que realizar� a leituda da palavra que ser� testada em busca
 * que caracteres que n�o se repetem.
 */
public class Main {

	/**
	 * M�todo principal que solicita a entrada de dados para o usu�rio, testa a
	 * palavra informada em busca do primeiro caractere que n�o se repete e
	 * informa para o usu�rio o resultado da busca.
	 *
	 * @param args
	 *            Argumentos de linha de comando.
	 */
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			String input = null;

			do {
				System.out.println("Informe os caracteres de entrada e pressione a tecla enter:");

				input = scanner.nextLine();
				Stream stream = new StreamImpl(input);
				Character firstUnrepeatableChar = UnrepeatableCharSearcher.firstChar(stream);

				if (firstUnrepeatableChar != null) {
					System.out.println("Primeiro caractere que n�o se repete: '" + firstUnrepeatableChar + "'");
				} else {
					System.out.println("A entrada informada n�o possui caracteres que n�o se repetem.");
				}

				System.out.println("Digite 'N' para informar uma nova entrada ou qualquer tecla para sair.");
				input = scanner.nextLine();
				System.out.println("======================================================================");

			} while (input.equals("N"));
		}
	}
}
