package br.com.ns;

import java.util.Scanner;

import br.com.ns.search.UnrepeatableCharSearcher;
import br.com.ns.stream.Stream;
import br.com.ns.stream.StreamImpl;

/**
 * Classe principal que realizará a leituda da palavra que será testada em busca
 * que caracteres que não se repetem.
 */
public class Main {

	/**
	 * Método principal que solicita a entrada de dados para o usuário, testa a
	 * palavra informada em busca do primeiro caractere que não se repete e
	 * informa para o usuário o resultado da busca.
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
					System.out.println("Primeiro caractere que não se repete: '" + firstUnrepeatableChar + "'");
				} else {
					System.out.println("A entrada informada não possui caracteres que não se repetem.");
				}

				System.out.println("Digite 'N' para informar uma nova entrada ou qualquer tecla para sair.");
				input = scanner.nextLine();
				System.out.println("======================================================================");

			} while (input.equals("N"));
		}
	}
}
