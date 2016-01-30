package br.com.ns.business;

import java.io.Serializable;
import java.util.regex.Pattern;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.inject.Inject;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.commons.lang3.StringUtils;

import br.com.ns.business.exception.BusinessException;
import br.com.ns.model.Cep;
import br.com.ns.model.repository.CepRepository;
import br.com.ns.util.Constantes;

/**
 * The Class CepBean.
 */
@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class CepBean implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -1642088405812638131L;

	/** The cep repository. */
	@Inject
	private CepRepository cepRepository;

	/**
	 * Recupera cep recursivamente.
	 *
	 * @param numero
	 *            the numero
	 * @return the cep
	 */
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public Cep recuperaCepRecursivamente(final String numero) {
		Cep cep = null;
		if (!numero.isEmpty()) {
			String novoNumero = StringUtils.rightPad(numero, Constantes.VALOR_OITO, Constantes.VALOR_ZERO.toString());
			cep = this.cepRepository.findOptionalByNumero(novoNumero);
			if (cep == null) {
				cep = this.recuperaCepRecursivamente(numero.substring(Constantes.VALOR_ZERO, numero.length() - Constantes.VALOR_UM));
			}
		}
		return cep;
	}

	/**
	 * Recupera por id.
	 *
	 * @param id
	 *            the id
	 * @return the cep
	 */
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public Cep recuperaPorId(final Integer id) {
		return this.cepRepository.findOptionalById(id);
	}

	/**
	 * Checks if is numero cep valido.
	 *
	 * @param numeroCep
	 *            the numero cep
	 * @return true, if is numero cep valido
	 */
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public boolean isNumeroCepValido(final String numeroCep) {
		Pattern pattern = Pattern.compile("[\\d]{8}");
		return pattern.matcher(numeroCep.toString()).matches();
	}

	/**
	 * Consulta numero cep.
	 *
	 * @param urlRecurso
	 *            the url recurso
	 * @param numeroCep
	 *            the numero cep
	 * @return the cep
	 * @throws BusinessException
	 *             the business exception
	 */
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public Cep consultaNumeroCep(final String urlRecurso, final String numeroCep) throws BusinessException {
		Client client = ClientBuilder.newClient();
		Response response = client.target(urlRecurso).queryParam("numeroCep", numeroCep).request(MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN).get();

		if (MediaType.APPLICATION_JSON_TYPE.equals(response.getMediaType())) {
			return response.readEntity(Cep.class);
		} else {
			throw new BusinessException(response.readEntity(String.class));
		}
	}
}
