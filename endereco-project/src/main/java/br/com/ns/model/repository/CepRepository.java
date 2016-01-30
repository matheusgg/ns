package br.com.ns.model.repository;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.Repository;

import br.com.ns.model.Cep;

/**
 * The Class CepRepository.
 *
 * @author Matheus
 * @version 1.0 - 28/04/2015
 */
@Repository(forEntity = Cep.class)
@RequestScoped
public abstract class CepRepository extends AbstractEntityRepository<Cep, Integer> implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -6838458028915037526L;

	/**
	 * Find optional by numero.
	 *
	 * @param numero
	 *            the numero
	 * @return the cep
	 */
	public abstract Cep findOptionalByNumero(final String numero);

	/**
	 * Find optional by id.
	 *
	 * @param id
	 *            the id
	 * @return the cep
	 */
	public abstract Cep findOptionalById(final Integer id);

}
