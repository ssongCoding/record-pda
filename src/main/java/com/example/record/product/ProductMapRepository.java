package com.example.record.product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductMapRepository {
    private final Map<Integer, Product> db
            = new HashMap<>();
    private int id = 1;

    public ProductMapRepository() {
        System.out.println("호호호호");
    }

    public Product getProduct(int id) {
        return db.get(id);
    }

    public List<Product> getProducts() {
        return new ArrayList<>(db.values());
    }

    public Product saveProduct(Product product) {
        db.put(id, product);
        return db.get(id++);
    }
}
