package br.com.ns.model;

import java.util.List;

import javax.enterprise.inject.Vetoed;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.metamodel.SingularAttribute;

import br.com.ns.model.repository.EnderecoRepository;

/**
 * The Class EnderecoRepositoryMock.
 *
 * @author Matheus
 * @version 1.0 - 29/04/2015
 */
@Vetoed
public class EnderecoRepositoryMock extends EnderecoRepository {

	/**
	 * @see org.apache.deltaspike.data.api.EntityRepository#saveAndFlush(java.lang.Object)
	 */
	@Override
	public Endereco saveAndFlush(Endereco entity) {

		return null;
	}

	/**
	 * @see org.apache.deltaspike.data.api.EntityRepository#saveAndFlushAndRefresh(java.lang.Object)
	 */
	@Override
	public Endereco saveAndFlushAndRefresh(Endereco entity) {

		return null;
	}

	/**
	 * @see org.apache.deltaspike.data.api.EntityRepository#removeAndFlush(java.lang.Object)
	 */
	@Override
	public void removeAndFlush(Endereco entity) {

	}

	/**
	 * @see org.apache.deltaspike.data.api.EntityRepository#refresh(java.lang.Object)
	 */
	@Override
	public void refresh(Endereco entity) {

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
	public Endereco findBy(Integer primaryKey) {

		return null;
	}

	/**
	 * @see org.apache.deltaspike.data.api.EntityRepository#findAll()
	 */
	@Override
	public List<Endereco> findAll() {

		return null;
	}

	/**
	 * @see org.apache.deltaspike.data.api.EntityRepository#findAll(int, int)
	 */
	@Override
	public List<Endereco> findAll(int start, int max) {

		return null;
	}

	/**
	 * @see org.apache.deltaspike.data.api.EntityRepository#findBy(java.lang.Object,
	 *      javax.persistence.metamodel.SingularAttribute[])
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Endereco> findBy(Endereco example, SingularAttribute<Endereco, ?>... attributes) {

		return null;
	}

	/**
	 * @see org.apache.deltaspike.data.api.EntityRepository#findBy(java.lang.Object,
	 *      int, int, javax.persistence.metamodel.SingularAttribute[])
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Endereco> findBy(Endereco example, int start, int max, SingularAttribute<Endereco, ?>... attributes) {

		return null;
	}

	/**
	 * @see org.apache.deltaspike.data.api.EntityRepository#findByLike(java.lang.Object,
	 *      javax.persistence.metamodel.SingularAttribute[])
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Endereco> findByLike(Endereco example, SingularAttribute<Endereco, ?>... attributes) {

		return null;
	}

	/**
	 * @see org.apache.deltaspike.data.api.EntityRepository#findByLike(java.lang.Object,
	 *      int, int, javax.persistence.metamodel.SingularAttribute[])
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Endereco> findByLike(Endereco example, int start, int max, SingularAttribute<Endereco, ?>... attributes) {

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
	public Long count(Endereco example, SingularAttribute<Endereco, ?>... attributes) {

		return null;
	}

	/**
	 * @see org.apache.deltaspike.data.api.EntityRepository#countLike(java.lang.Object,
	 *      javax.persistence.metamodel.SingularAttribute[])
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Long countLike(Endereco example, SingularAttribute<Endereco, ?>... attributes) {

		return null;
	}

	/**
	 * @see br.com.ns.model.repository.EnderecoRepository#findOptionalById(java.lang.Integer)
	 */
	@Override
	public Endereco findOptionalById(Integer id) {

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
	protected CriteriaQuery<Endereco> criteriaQuery() {

		return null;
	}

	/**
	 * @see org.apache.deltaspike.data.api.AbstractEntityRepository#typedQuery(java.lang.String)
	 */
	@Override
	protected TypedQuery<Endereco> typedQuery(String qlString) {

		return null;
	}

	/**
	 * @see org.apache.deltaspike.data.api.AbstractEntityRepository#entityClass()
	 */
	@Override
	protected Class<Endereco> entityClass() {

		return null;
	}

}
