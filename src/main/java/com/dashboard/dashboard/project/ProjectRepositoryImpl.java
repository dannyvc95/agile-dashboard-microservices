package com.dashboard.dashboard.project;

import javax.persistence.EntityManager;

public abstract class ProjectRepositoryImpl implements ProjectRepository{

    private final EntityManager entityManager;

    protected ProjectRepositoryImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }
}
