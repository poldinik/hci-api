package com.cosmink.models.semantic;

import com.cosmink.models.CRUD;
import com.cosmink.models.Dao;

import javax.persistence.EntityExistsException;
import javax.persistence.PersistenceException;
import javax.persistence.TransactionRequiredException;

public class SemanticVideoDao extends Dao implements CRUD<SemanticVideo>{
    @Override
    public Boolean create(SemanticVideo entity) throws EntityExistsException, IllegalStateException, IllegalArgumentException, TransactionRequiredException {
        entityManager.persist(entity);
        return true;
    }

    @Override
    public SemanticVideo read(long primaryKey) throws IllegalStateException, IllegalArgumentException {
        return null;
    }

    @Override
    public Boolean update(SemanticVideo entity) throws IllegalStateException, IllegalArgumentException, TransactionRequiredException {
        return null;
    }

    @Override
    public Boolean delete(SemanticVideo entity) throws IllegalStateException, IllegalArgumentException, TransactionRequiredException, PersistenceException {
        return null;
    }
}
