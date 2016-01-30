package br.com.ns.model;

import java.util.List;

import javax.enterprise.inject.Vetoed;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.metamodel.SingularAttribute;

import br.com.ns.model.repository.CepRepository;

/**
 * The Class CepRepositoryMock.
 *
 * @author Matheus
 * @version 1.0 - 29/04/2015
 */
@Vetoed
public class CepRepositoryMock extends CepRepository {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 5132408386200192801L;

	/**
	 * @see org.apache.deltaspike.data.api.EntityRepository#save(java.lang.Object)
	 */
	@Override
	public Cep save(Cep entity) {

		return null;
	}

	/**
	 * @see org.apache.deltaspike.data.api.EntityRepository#saveAndFlush(java.lang.Object)
	 */
	@Override
	public Cep saveAndFlush(Cep entity) {

		return null;
	}

	/**
	 * @see org.apache.deltaspike.data.api.EntityRepository#saveAndFlushAndRefresh(java.lang.Object)
	 */
	@Override
	public Cep saveAndFlushAndRefresh(Cep entity) {

		return null;
	}

	/**
	 * @see org.apache.deltaspike.data.api.EntityRepository#remove(java.lang.Object)
	 */
	@Override
	public void remove(Cep entity) {

	}

	/**
	 * @see org.apache.deltaspike.data.api.EntityRepository#removeAndFlush(java.lang.Object)
	 */
	@Override
	public void removeAndFlush(Cep entity) {

	}

	/**
	 * @see org.apache.deltaspike.data.api.EntityRepository#refresh(java.lang.Object)
	 */
	@Override
	public void refresh(Cep entity) {

	}

	/**
	 * @see org.apache.deltaspike.data.api.EntityRepository#flush()
	 */
	@Override
	public void flush() {

	}

	/**
	 * @see org.apache.deltaspike.data.api.EntityRepository#findBy(java.io.Serializable)
	 */
	@Override
	public Cep findBy(Integer primaryKey) {

		return null;
	}

	/**
	 * @see org.apache.deltaspike.data.api.EntityRepository#findAll()
	 */
	@Override
	public List<Cep> findAll() {

		return null;
	}

	/**
	 * @see org.apache.deltaspike.data.api.EntityRepository#findAll(int, int)
	 */
	@Override
	public List<Cep> findAll(int start, int max) {

		return null;
	}

	/**
	 * @see org.apache.deltaspike.data.api.EntityRepository#findBy(java.lang.Object,
	 *      javax.persistence.metamodel.SingularAttribute[])
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Cep> findBy(Cep example, SingularAttribute<Cep, ?>... attributes) {

		return null;
	}

	/**
	 * @see org.apache.deltaspike.data.api.EntityRepository#findBy(java.lang.Object,
	 *      int, int, javax.persistence.metamodel.SingularAttribute[])
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Cep> findBy(Cep example, int start, int max, SingularAttribute<Cep, ?>... attributes) {

		return null;
	}

	/**
	 * @see org.apache.deltaspike.data.api.EntityRepository#findByLike(java.lang.Object,
	 *      javax.persistence.metamodel.SingularAttribute[])
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Cep> findByLike(Cep example, SingularAttribute<Cep, ?>... attributes) {

		return null;
	}

	/**
	 * @see org.apache.deltaspike.data.api.EntityRepository#findByLike(java.lang.Object,
	 *      int, int, javax.persistence.metamodel.SingularAttribute[])
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Cep> findByLike(Cep example, int start, int max, SingularAttribute<Cep, ?>... attributes) {

		return null;
	}

	/**
	 * @see org.apache.deltaspike.data.api.EntityRepository#count()
	 */
	@Override
	public Long count() {

		return null;
	}

	/**
	 * @see org.apache.deltaspike.data.api.EntityRepository#count(java.lang.Object,
	 *      javax.persistence.metamodel.SingularAttribute[])
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Long count(Cep example, SingularAttribute<Cep, ?>... attributes) {

		return null;
	}

	/**
	 * @see org.apache.deltaspike.data.api.EntityRepository#countLike(java.lang.Object,
	 *      javax.persistence.metamodel.SingularAttribute[])
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Long countLike(Cep example, SingularAttribute<Cep, ?>... attributes) {

		return null;
	}

	/**
	 * @see br.com.ns.model.repository.CepRepository#findOptionalByNumero(java.lang.String)
	 */
	@Override
	public Cep findOptionalByNumero(String numero) {

		return null;
	}

	/**
	 * @see br.com.ns.model.repository.CepRepository#findOptionalById(java.lang.Integer)
	 */
	@Override
	public Cep findOptionalById(Integer id) {

		return null;
	}

	/**
	 * @see org.apache.deltaspike.data.api.AbstractEntityRepository#entityManager()
	 */
	@Override
	protected EntityManager entityManager() {

		return null;
	}

	/**
	 * @see org.apache.deltaspike.data.api.AbstractEntityRepository#criteriaQuery()
	 */
	@Override
	protected CriteriaQuery<Cep> criteriaQuery() {

		return null;
	}

	/**
	 * @see org.apache.deltaspike.data.api.AbstractEntityRepository#typedQuery(java.lang.String)
	 */
	@Override
	protected TypedQuery<Cep> typedQuery(String qlString) {

		return null;
	}

	/**
	 * @see org.apache.deltaspike.data.api.AbstractEntityRepository#entityClass()
	 */
	@Override
	protected Class<Cep> entityClass() {

		return null;
	}

}
