package com.dashboard.dashboard.card;

import javax.persistence.EntityManager;

public abstract class CardRepositoryImpl implements CardRepository{

    private final EntityManager entityManager;

    protected CardRepositoryImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }
}
