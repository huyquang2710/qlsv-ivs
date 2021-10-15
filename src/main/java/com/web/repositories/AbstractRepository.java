package com.web.repositories;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.web.utils.JpaUtil;

@Repository
public class AbstractRepository<T> {
	// khai bao manager Factory
	public static final EntityManager ENTITY_MANAGER = JpaUtil.getEntityManager();

	// find all
	public List<T> findAll(Class<T> clazz) {
		// lay ten table
		String entityName = clazz.getSimpleName();

		StringBuilder hql = new StringBuilder();
		hql.append("SELECT e FROM ").append(entityName).append(" e");

		// thuc hien query
		TypedQuery<T> query = ENTITY_MANAGER.createQuery(hql.toString(), clazz);
		return query.getResultList();
	}

	// create
	public T create(T entity) {
		try {
			ENTITY_MANAGER.getTransaction().begin();
			ENTITY_MANAGER.persist(entity);
			ENTITY_MANAGER.getTransaction().commit();

			System.err.println("Created Success");
			return entity;
		} catch (Exception e) {
			ENTITY_MANAGER.getTransaction().rollback();

			System.out.println("Cannot created: " + entity.getClass().getSimpleName());
			throw new RuntimeException();
		}
	}

	// update
	public T update(T entity) {
		try {
			ENTITY_MANAGER.getTransaction().begin();
			ENTITY_MANAGER.merge(entity);
			ENTITY_MANAGER.getTransaction().commit();

			System.out.println("Update Success");
			return entity;
		} catch (Exception e) {
			ENTITY_MANAGER.getTransaction().rollback();

			System.out.println("Cannot updated: " + entity.getClass().getSimpleName());
			throw new RuntimeException();
		}
	}

	// delete
	public T delete(T entity) {
		try {
			ENTITY_MANAGER.getTransaction().begin();
			ENTITY_MANAGER.remove(entity);
			ENTITY_MANAGER.getTransaction().commit();

			System.out.println("Deleted Success");
			return entity;
		} catch (Exception e) {
			ENTITY_MANAGER.getTransaction().rollback();

			System.out.println("Cannot deleted: " + entity.getClass().getSimpleName());
			throw new RuntimeException();
		}
	}

	// find by id
	public Optional<T> findById(Class<T> clazz, Integer id) {
		return Optional.of(ENTITY_MANAGER.find(clazz, id));
	}
}
