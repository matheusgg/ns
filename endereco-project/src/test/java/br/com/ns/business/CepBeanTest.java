/**
 * 
 */
package br.com.ns.business;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import br.com.ns.base.AbstractBaseTest;
import br.com.ns.model.Cep;
import br.com.ns.model.CepRepositoryMock;

/**
 * The Class CepBeanTest.
 *
 * @author Matheus
 */
public class CepBeanTest extends AbstractBaseTest {

	/** The Constant URL_SERVICO_CONSULTA_CEP. */
	private static final String URL_SERVICO_CONSULTA_CEP = "http://localhost:8080/endereco-project/rest/cep/buscaDadosCepPorNumero";

	/** The cep bean. */
	private CepBean cepBean;

	/**
	 * Sets the up.
	 *
	 * @throws Exception
	 *             the exception
	 */
	@Before
	public void setUp() throws Exception {
		CepRepositoryMock cepRepositoryMock = Mockito.mock(CepRepositoryMock.class);

		Mockito.when(cepRepositoryMock.findOptionalByNumero(Mockito.anyString())).thenReturn(null, null, Mockito.mock(Cep.class));
		Mockito.when(cepRepositoryMock.findOptionalById(Mockito.anyInt())).thenReturn(Mockito.mock(Cep.class));

		this.cepBean = new CepBean();
		super.initField(this.cepBean, "cepRepository", cepRepositoryMock);
	}

	/**
	 * Test method for
	 * {@link br.com.ns.business.CepBean#recuperaCepRecursivamente(java.lang.String)}
	 * .
	 */
	@Test
	public void testRecuperaCepRecursivamente() {
		Assert.assertNotNull(this.cepBean.recuperaCepRecursivamente("04419140"));
	}

	/**
	 * Test method for
	 * {@link br.com.ns.business.CepBean#recuperaPorId(java.lang.Integer)}.
	 */
	@Test
	public void testRecuperaPorId() {
		Assert.assertNotNull(this.cepBean.recuperaPorId(10));
	}

	/**
	 * Test method for
	 * {@link br.com.ns.business.CepBean#isNumeroCepValido(java.lang.String)}.
	 */
	@Test
	public void testIsNumeroCepValidoTrue() {
		Assert.assertTrue(this.cepBean.isNumeroCepValido("04419140"));
	}

	/**
	 * Test method for
	 * {@link br.com.ns.business.CepBean#isNumeroCepValido(java.lang.String)}.
	 */
	@Test
	public void testIsNumeroCepValidoFalse() {
		Assert.assertFalse(this.cepBean.isNumeroCepValido("0441914"));
		Assert.assertFalse(this.cepBean.isNumeroCepValido("shfgbsfbdh"));
		Assert.assertFalse(this.cepBean.isNumeroCepValido("044191409"));
		Assert.assertFalse(this.cepBean.isNumeroCepValido(""));
		Assert.assertFalse(this.cepBean.isNumeroCepValido("75e67d34"));
	}

	/**
	 * Test method for
	 * {@link br.com.ns.business.CepBean#consultaNumeroCep(java.lang.String)}.
	 */
	// @Test
	public void testConsultaNumeroCep() {
		Assert.assertNotNull(this.cepBean.consultaNumeroCep(URL_SERVICO_CONSULTA_CEP, "04419140"));
	}

	/**
	 * Test method for
	 * {@link br.com.ns.business.CepBean#consultaNumeroCep(java.lang.String)}.
	 */
	// @Test(expected = BusinessException.class)
	public void testConsultaNumeroCepInvalido() {
		Assert.assertNotNull(this.cepBean.consultaNumeroCep(URL_SERVICO_CONSULTA_CEP, "0rf19140"));
	}

}
