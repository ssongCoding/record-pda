package com.example.record.product;

import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDBRepository {
//    @Autowired
//    EntityManager entityManager;
    @PersistenceUnit
    private EntityManagerFactory emf;

    public void save(Product newProduct) {
        EntityManager entityManager = emf.createEntityManager();

        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        entityManager.persist(newProduct);
        entityTransaction.commit();
    }
}
