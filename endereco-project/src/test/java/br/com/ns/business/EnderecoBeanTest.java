package br.com.ns.business;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import br.com.ns.base.AbstractBaseTest;
import br.com.ns.model.Endereco;
import br.com.ns.model.EnderecoRepositoryMock;

/**
 * The Class EnderecoBeanTest.
 *
 * @author Matheus
 * @version 1.0 - 29/04/2015
 */
public class EnderecoBeanTest extends AbstractBaseTest {

	/** The endereco bean. */
	private EnderecoBean enderecoBean;

	/**
	 * Sets the up.
	 *
	 * @throws Exception
	 *             the exception
	 */
	@Before
	public void setUp() throws Exception {
		EnderecoRepositoryMock enderecoRepositoryMock = Mockito.mock(EnderecoRepositoryMock.class);

		Mockito.when(enderecoRepositoryMock.save(Mockito.any())).thenReturn(Mockito.mock(Endereco.class));
		Mockito.doNothing().when(enderecoRepositoryMock).remove(Mockito.any());
		Mockito.when(enderecoRepositoryMock.findOptionalById(Mockito.anyInt())).thenReturn(Mockito.mock(Endereco.class));

		this.enderecoBean = new EnderecoBean();
		super.initField(this.enderecoBean, "enderecoRepository", enderecoRepositoryMock);
	}

	/**
	 * Test salva.
	 */
	@Test
	public void testSalva() {
		Assert.assertNotNull(this.enderecoBean.salva(new Endereco()));
	}

	/**
	 * Test remove.
	 */
	@Test
	public void testRemove() {
		this.enderecoBean.remove(new Endereco());
	}

	/**
	 * Test recupera por id.
	 */
	@Test
	public void testRecuperaPorId() {
		Assert.assertNotNull(this.enderecoBean.recuperaPorId(10));
	}

}
