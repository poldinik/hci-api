package com.cosmink.models.user;

import com.cosmink.models.CRUD;
import com.cosmink.models.Dao;

import javax.persistence.EntityExistsException;
import javax.persistence.PersistenceException;
import javax.persistence.Query;
import javax.persistence.TransactionRequiredException;
import java.util.List;

public class UserDao extends Dao implements CRUD<User>{

    @Override
    public Boolean create(User entity) throws EntityExistsException, IllegalStateException, IllegalArgumentException, TransactionRequiredException {
        entityManager.persist(entity);
        return true;
    }

    @Override
    public User read(long primaryKey) throws IllegalStateException, IllegalArgumentException {
        return null;
    }

    @Override
    public Boolean update(User entity) throws IllegalStateException, IllegalArgumentException, TransactionRequiredException {
        return null;
    }

    @Override
    public Boolean delete(User entity) throws IllegalStateException, IllegalArgumentException, TransactionRequiredException, PersistenceException {
        return null;
    }

    public List<User> getUsers() throws Exception {
        Query query = entityManager.createQuery("SELECT m from User as m");
        return query.getResultList();
    }

    //FIXME: aggiungere throws exceptions idonee

    public User findByUsernameOrEmail(String identifier) {
        List<User> users = entityManager.createQuery("SELECT u FROM User u WHERE u.username = :identifier OR u.userCredentials.email= :identifier", User.class)
                .setParameter("identifier", identifier)
                .setMaxResults(1)
                .getResultList();
        if (users.isEmpty()) {
            return null;
        }
        return users.get(0);
    }

}
