package br.com.ns.rest;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.ns.business.CepBean;
import br.com.ns.model.Cep;
import br.com.ns.rest.base.AbstractResource;

/**
 * The Class CepResource.
 *
 * @author Matheus
 * @version 1.0 - 28/04/2015
 */
@Path("/cep")
public class CepResource extends AbstractResource {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 3978656719684916425L;

	/** The cep bean. */
	@Inject
	private CepBean cepBean;

	/**
	 * Busca dados cep por numero.
	 *
	 * @param numeroCep
	 *            the numero cep
	 * @return the response
	 */
	@GET
	@Path("/buscaDadosCepPorNumero")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN })
	@Consumes(MediaType.APPLICATION_JSON)
	public Response buscaDadosCepPorNumero(@QueryParam("numeroCep") final String numeroCep) {
		if (this.cepBean.isNumeroCepValido(numeroCep)) {
			Cep cep = this.cepBean.recuperaCepRecursivamente(numeroCep);
			if (cep != null) {
				return Response.ok(cep).build();
			} else {
				return super.buildTextualResponse("msg.cep.nao.encontrado");
			}
		}
		return super.buildTextualResponse("msg.cep.invalido");
	}

}
