package com.dashboard.dashboard.user;

import javax.persistence.EntityManager;
import javax.transaction.TransactionManager;

public abstract class UserRepositoryImpl implements UserRepository {

    private final EntityManager entityManager;

    protected UserRepositoryImpl(EntityManager entityManager, TransactionManager transactionManager) {
        this.entityManager = entityManager;
    }
}
