package com.example.record.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;

@Component
public class ProductApplicationRunner
        implements ApplicationRunner {
    @Autowired
    ProductDBRepository productDBRepository;

    @Transactional
    @Override
    public void run(ApplicationArguments args) throws Exception {
         productDBRepository.save(new Product(
                 "heartbreaker", "GD",
                 30000, LocalDate.of(2009, 8, 18)
         ));
    }
}