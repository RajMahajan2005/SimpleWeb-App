package com.telusko.SimpleWebApp.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;



@Data
@AllArgsConstructor
@Entity
public class Product {

    @Id
    private int proId;
    private String prodName;
    private int price;

    public Product() {

    }

}
