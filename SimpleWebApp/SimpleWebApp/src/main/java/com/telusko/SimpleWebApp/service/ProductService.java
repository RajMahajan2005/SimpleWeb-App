package com.telusko.SimpleWebApp.service;

import com.telusko.SimpleWebApp.model.Product;
import com.telusko.SimpleWebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

//    List<Product> products = new ArrayList<>(Arrays.asList(
//            new Product(101 , "iphone" , 50000),
//            new Product(102 , "canon" , 70000),
//            new Product(103 , "Samsung" , 80000)));

    public List<Product> getProducts() {
        return repo.findAll();
    }

    public Product getProductById(int proId) {
        return repo.findById(proId).orElse(new Product());
    }

    public void addProduct(Product prod) {
       repo.save(prod);
    }

    public void updateProduct(Product prod) {
      repo.save(prod);
    }

    public void deleteProduct(int proId) {
       repo.deleteById(proId);

    }
}
