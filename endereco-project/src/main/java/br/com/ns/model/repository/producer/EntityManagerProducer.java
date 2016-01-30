package br.com.ns.model.repository.producer;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

/**
 * Classe responsavel por criar os EntityManagers utilizadas pelo Apache
 * DeltaSpike.
 * 
 * @author Matheus
 *
 */
@SessionScoped
public class EntityManagerProducer implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -3086950208549324669L;

	/** The emf. */
	@PersistenceUnit
	private EntityManagerFactory emf;

	/**
	 * Creates the.
	 *
	 * @return the entity manager
	 */
	@Produces
	@RequestScoped
	public EntityManager create() {
		return this.emf.createEntityManager();
	}

	/**
	 * Destroy.
	 *
	 * @param em
	 *            the em
	 */
	public void destroy(@Disposes EntityManager em) {
		if (em.isOpen()) {
			em.close();
		}
	}

}
