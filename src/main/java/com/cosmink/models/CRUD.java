package com.cosmink.models;

import javax.persistence.EntityExistsException;
import javax.persistence.PersistenceException;
import javax.persistence.TransactionRequiredException;
import java.io.Serializable;

public interface CRUD<T> {
    public Boolean create(T entity) throws EntityExistsException, IllegalStateException, IllegalArgumentException, TransactionRequiredException;
    public T read(long primaryKey) throws IllegalStateException, IllegalArgumentException;
    public Boolean update(T entity) throws IllegalStateException, IllegalArgumentException, TransactionRequiredException;
    public Boolean delete(T entity) throws IllegalStateException, IllegalArgumentException, TransactionRequiredException, PersistenceException;
}
