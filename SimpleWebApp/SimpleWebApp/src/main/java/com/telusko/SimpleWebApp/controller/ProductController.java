package com.telusko.SimpleWebApp.controller;

import com.telusko.SimpleWebApp.model.Product;
import com.telusko.SimpleWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> getProducts() {

        return service.getProducts();
    }

    @GetMapping("/products/{proId}")
    public Product getProductById(@PathVariable int proId) {

        return service.getProductById(proId);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Product prod) {
        System.out.println(prod);
        service.addProduct(prod);
    }

    @PutMapping("/products")
    public void updateProduct(@RequestBody Product prod){

        service.updateProduct(prod);
    }

    @DeleteMapping("/products/{proId}")
    public void deleteProduct(@PathVariable int proId) {
        service.deleteProduct(proId);
    }
}
