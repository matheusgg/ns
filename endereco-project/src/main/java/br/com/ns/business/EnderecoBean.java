package br.com.ns.business;

import java.io.Serializable;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.inject.Inject;

import org.apache.deltaspike.jpa.api.transaction.Transactional;

import br.com.ns.model.Endereco;
import br.com.ns.model.repository.EnderecoRepository;

/**
 * The Class EnderecoBean.
 */
@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class EnderecoBean implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -1317944274825839588L;

	/** The endereco repository. */
	@Inject
	private EnderecoRepository enderecoRepository;

	/**
	 * Salva.
	 *
	 * @param endereco
	 *            the endereco
	 * @return the endereco
	 */
	@Transactional
	public Endereco salva(final Endereco endereco) {
		return this.enderecoRepository.save(endereco);
	}

	/**
	 * Removes the.
	 *
	 * @param endereco
	 *            the endereco
	 */
	@Transactional
	public void remove(final Endereco endereco) {
		this.enderecoRepository.remove(endereco);
	}

	/**
	 * Recupera por id.
	 *
	 * @param id
	 *            the id
	 * @return the cep
	 */
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public Endereco recuperaPorId(final Integer id) {
		return this.enderecoRepository.findOptionalById(id);
	}

}
