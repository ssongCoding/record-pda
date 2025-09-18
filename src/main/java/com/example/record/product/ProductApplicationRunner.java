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
//    ProductDBRepository productDBRepository;
    ProductJPARepository productJPARepository;

    @Transactional
    @Override
    public void run(ApplicationArguments args) throws Exception {
        productJPARepository.save(new Product(
                 "nextlevel", "aespa",
                 24000, LocalDate.of(2021, 5, 17)
         ));
//         productDBRepository.save(new Product(
//                 "heartbreaker", "GD",
//                 30000, LocalDate.of(2009, 8, 18)
//         ));
    }
}