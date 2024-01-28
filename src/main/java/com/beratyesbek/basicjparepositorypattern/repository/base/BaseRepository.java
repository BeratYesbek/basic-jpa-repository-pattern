package com.beratyesbek.basicjparepositorypattern.repository.base;

import com.beratyesbek.basicjparepositorypattern.model.BaseEntity;

import java.util.List;

public interface BaseRepository<E extends BaseEntity, I> {
    void save(E entity);

    void update(E entity, I id);

    List<E> findAll();

    E findById(I id);
}
