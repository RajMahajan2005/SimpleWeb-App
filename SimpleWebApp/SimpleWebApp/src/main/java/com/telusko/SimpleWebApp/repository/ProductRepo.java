package com.telusko.SimpleWebApp.repository;


import com.telusko.SimpleWebApp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo  extends JpaRepository<Product, Integer> {

}
