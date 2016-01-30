package br.com.ns.stream;

/**
 * The Class StreamImpl.
 */
public class StreamImpl implements Stream {

	/** The characters. */
	private char[] characters;

	/** The index. */
	private int index;

	/**
	 * Instantiates a new stream impl.
	 *
	 * @param input
	 *            the input
	 */
	public StreamImpl(String input) {
		this.characters = input.toCharArray();
	}

	/**
	 * @see br.com.ns.stream.Stream#getNext()
	 */
	@Override
	public char getNext() {
		return this.characters[this.index++];
	}

	/**
	 * @see br.com.ns.stream.Stream#hasNext()
	 */
	@Override
	public boolean hasNext() {
		return this.index < this.characters.length;
	}

}
