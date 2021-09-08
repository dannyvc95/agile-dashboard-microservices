package com.dashboard.dashboard.user;

import javax.persistence.EntityManager;

public abstract class UserRepositoryImpl implements UserRepository {

    private final EntityManager entityManager;

    protected UserRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
}
