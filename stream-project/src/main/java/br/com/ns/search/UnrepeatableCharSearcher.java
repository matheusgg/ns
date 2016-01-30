package br.com.ns.search;

import java.util.ArrayList;
import java.util.List;

import br.com.ns.stream.Stream;

/**
 * Classe respons�vel pelas opera��es de busca atrav�s de {@link Stream Streams}
 */
public final class UnrepeatableCharSearcher {

	/**
	 * Construtor privado.
	 */
	private UnrepeatableCharSearcher() {

	}

	/**
	 * Pesquisa pelo primeiro caractere n�o repetido dentro da {@link Stream
	 * Stream} informada. Realiza um loop utilizando o m�todo
	 * {@link Stream#hasNext() hasNext} para verificar se ainda existem
	 * caracteres a serem lidos em busca do primeiro caractere que n�o se
	 * repete.
	 *
	 * @param stream
	 *            A origem de dados onde os caracteres ser�o lidos.
	 * @return O primeiro caractere que n�o se repete, ou null, caso n�o existam
	 *         caracteres que n�o se repitam.
	 */
	public static Character firstChar(Stream stream) {
		List<Character> characters = new ArrayList<>();

		while (stream.hasNext()) {
			char character = stream.getNext();
			int indexOf = characters.indexOf(character);
			if (indexOf > -1) {
				characters.remove(indexOf);
			} else {
				characters.add(character);
			}
		}

		return !characters.isEmpty() ? characters.get(0) : null;
	}

}
