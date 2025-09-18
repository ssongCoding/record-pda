package com.example.record.product;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductJPARepository
    extends JpaRepository<Product, Integer> {
//    List<Product> findByName(String name);
}
