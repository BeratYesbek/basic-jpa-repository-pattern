package com.beratyesbek.basicjparepositorypattern.repository.base;

import com.beratyesbek.basicjparepositorypattern.model.BaseEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public class BaseRepositoryImpl<E extends BaseEntity, I> implements BaseRepository<E, I> {

    @PersistenceContext
    private  EntityManager entityManager;
    private final Class<E> entityClass;

    public BaseRepositoryImpl(Class<E> entityClass) {
        this.entityClass = entityClass;
    }

    @Override
    @Transactional
    public void save(E entity) {
        entityManager.persist(entity);
    }

    @Override
    @Transactional
    public void update(E entity, I id) {
       E result = entityManager.find((Class<E>) entity.getClass(), id);
       if (result != null) {
           entityManager.merge(result);
       }

    }

    @Override
    @Transactional
    public List<E> findAll() {
        return entityManager.createQuery("SELECT e FROM " + entityClass.getSimpleName() + " e", entityClass).getResultList();
    }

    @Override
    @Transactional
    public E findById(I id) {
        return entityManager.find(entityClass, id);
    }
}
