package com.example.record.product;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public class RecordRegisterDto {
    private String title;
    private String artist;
    private int price;
    private LocalDate releaseDate;

    public Product toEntity() {
        return new Product(title, artist, price, releaseDate);
    }
}
