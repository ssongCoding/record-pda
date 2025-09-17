package com.example.record.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

public class ProductService {
    private final ProductMapRepository productMapRepository;

    @Autowired
    private ProductDBRepository productDBRepository;

    @Autowired
    public ProductService(ProductMapRepository productMapRepository) {
        this.productMapRepository = productMapRepository;
    }

    public Product getProduct(int id) {
        return productMapRepository.getProduct(id);
    }

    public List<Product> getProducts() {
        return productMapRepository.getProducts();
    }

    public Product saveProduct(RecordRegisterDto recordRegisterDto) {
        // 로직...
        Product newProduct = recordRegisterDto.toEntity();
        return productMapRepository.saveProduct(newProduct);
    }
}