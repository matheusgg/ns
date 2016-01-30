package br.com.ns.model.repository;

import javax.enterprise.context.RequestScoped;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.Repository;

import br.com.ns.model.Endereco;

/**
 * The Class EnderecoRepository.
 */
@Repository(forEntity = Endereco.class)
@RequestScoped
public abstract class EnderecoRepository extends AbstractEntityRepository<Endereco, Integer> {

	/**
	 * Find optional by id.
	 *
	 * @param id
	 *            the id
	 * @return the endereco
	 */
	public abstract Endereco findOptionalById(Integer id);

	/**
	 * Save.
	 *
	 * @param entity
	 *            the entity
	 * @return the endereco
	 * @see org.apache.deltaspike.data.api.EntityRepository#save(java.lang.Object)
	 */
	@Override
	public Endereco save(final Endereco entity) {
		if (entity.getId() == null) {
			this.entityManager().persist(entity);
		} else {
			return this.entityManager().merge(entity);
		}
		return entity;
	}

	/**
	 * @see org.apache.deltaspike.data.api.EntityRepository#remove(java.lang.Object)
	 */
	@Override
	public void remove(final Endereco entity) {
		this.entityManager().remove(this.findOptionalById(entity.getId()));
	}

}