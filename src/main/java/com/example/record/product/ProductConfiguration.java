package com.example.record.product;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductConfiguration {

    // 아래 메소드가 반환하는 객체를 스프링빈으로 등록
    @Bean
    public ProductMapRepository productRepository() {
        return new ProductMapRepository();
    }

    @Bean
    public ProductService productService() {
//        return new ProductService(new ProductRepository());
        return new ProductService(productRepository());
    }
}
