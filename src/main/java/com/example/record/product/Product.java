package com.example.record.product;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String title;
    private String artist;
    private int price;
    private LocalDate releaseDate;

    public Product(String title, String artist, int price, LocalDate releaseDate) {
        this.title = title;
        this.artist = artist;
        this.price = price;
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "Record{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", price=" + price +
                ", releaseDate=" + releaseDate +
                '}';
    }
}
