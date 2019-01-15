package com.cosmink.models;


import org.hibernate.search.jpa.FullTextEntityManager;
import org.hibernate.search.jpa.Search;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

@Stateless
public class Dao {

    @PersistenceContext(unitName = "persistence-unit-1", type = PersistenceContextType.EXTENDED)
    protected EntityManager entityManager;



    //FullTextEntityManager fullTextEntityManager = Search.getFullTextEntityManager(entityManager);
}
