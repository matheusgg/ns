/**
 * 
 */
package br.com.ns.search;

import org.junit.Assert;
import org.junit.Test;

import br.com.ns.stream.StreamImpl;

/**
 * The Class UnrepeatableCharSearcherTest.
 */
public class UnrepeatableCharSearcherTest {

	/**
	 * Test method for
	 * {@link br.com.ns.search.UnrepeatableCharSearcher#firstChar(br.com.ns.stream.Stream)}
	 */
	@Test
	public void testFirstCharSuccess() {
		Assert.assertNotNull(UnrepeatableCharSearcher.firstChar(new StreamImpl("aAbBABac")));
		Assert.assertNotNull(UnrepeatableCharSearcher.firstChar(new StreamImpl("123456789")));
		Assert.assertNotNull(UnrepeatableCharSearcher.firstChar(new StreamImpl("1234567891")));
	}

	/**
	 * Test method for
	 * {@link br.com.ns.search.UnrepeatableCharSearcher#firstChar(br.com.ns.stream.Stream)}
	 */
	@Test
	public void testFirstCharUnsuccess() {
		Assert.assertNull(UnrepeatableCharSearcher.firstChar(new StreamImpl("")));
		Assert.assertNull(UnrepeatableCharSearcher.firstChar(new StreamImpl("aAbBABacbc")));
		Assert.assertNull(UnrepeatableCharSearcher.firstChar(new StreamImpl("123456789987654321")));
	}

}
