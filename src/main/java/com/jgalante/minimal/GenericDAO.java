package com.jgalante.minimal;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaQuery;

import com.jgalante.util.Reflections;

public abstract class GenericDAO<T extends GenericEntity> implements
		Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	@DataRepository
	private EntityManager em;

	private Class<T> entityClass;

	protected Class<T> getEntityClass() {
		if (this.entityClass == null) {
			this.entityClass = Reflections.getGenericTypeArgument(
					this.getClass(), 0);
		}

		return this.entityClass;
	}

	protected EntityManager getEntityManager() {
		return em;
	}

	public T find(Object id) {
		return this.em.find(getEntityClass(), id);
	}
	
	public List<T> findAll() {
		CriteriaQuery<T> cq = getEntityManager().getCriteriaBuilder().createQuery(getEntityClass());
		cq.select(cq.from(getEntityClass()));
		return getEntityManager().createQuery(cq).getResultList();
	}

}
