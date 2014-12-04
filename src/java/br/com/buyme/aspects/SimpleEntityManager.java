/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.buyme.aspects;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author jurandir.pereira
 */
public class SimpleEntityManager {

    private static final ThreadLocal<EntityManager> threadEntityManager = new ThreadLocal<>();
    private static EntityManagerFactory entityManagerFactory;

    public SimpleEntityManager() {
    }

    public SimpleEntityManager(String banco) {

        if (entityManagerFactory == null) {
            entityManagerFactory = Persistence.createEntityManagerFactory(banco);
        }

        EntityManager entityManager = threadEntityManager.get();

        if (entityManager == null || !entityManager.isOpen()) {
            entityManager = entityManagerFactory.createEntityManager();
            SimpleEntityManager.threadEntityManager.set(entityManager);
        }
    }

    public static EntityManager getEntityManager(String banco) {
        if (entityManagerFactory == null) {
            entityManagerFactory = Persistence.createEntityManagerFactory(banco);
        }
        EntityManager entityManager = threadEntityManager.get();

        if (entityManager == null || !entityManager.isOpen()) {
            entityManager = entityManagerFactory.createEntityManager();
            SimpleEntityManager.threadEntityManager.set(entityManager);
        }

        return entityManager;
    }

    public static void closeEntityManager() {
        EntityManager entityManager = threadEntityManager.get();

        if (entityManager != null) {
            EntityTransaction transaction = entityManager.getTransaction();

            if (transaction.isActive()) {
                transaction.commit();
            }

            entityManager.close();

            threadEntityManager.set(null);
        }
    }

    public static void closeEntityManagerFactory() {
        closeEntityManager();
        entityManagerFactory.close();
    }

    public void beginTransaction() {
        threadEntityManager.get().getTransaction().begin();
    }

    public void commit() {
        threadEntityManager.get().getTransaction().commit();
    }

    public void close() {
        closeEntityManager();
        entityManagerFactory.close();
    }

    public void rollBack() {
        threadEntityManager.get().getTransaction().rollback();
    }

    public EntityManager getEntityManager() {
        return threadEntityManager.get();
    }

    public boolean isOpen() {
//        return entityManagerFactory.isOpen();
        return threadEntityManager.get().getTransaction().isActive();
    }
}
