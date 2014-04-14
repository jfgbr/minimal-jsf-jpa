package com.jgalante.minimal;

import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

//@Stateful
//@ApplicationScoped
//@RequestScoped
public class EntityManagerProducer{
	
	private EntityManager entityManager;
	
	@Produces @DataRepository
	public EntityManager getEntityManager() {
		return entityManager;
	}
	
	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
}
