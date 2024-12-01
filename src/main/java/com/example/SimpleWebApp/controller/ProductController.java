package com.example.SimpleWebApp.controller;

import com.example.SimpleWebApp.model.Product;
import com.example.SimpleWebApp.services.ProductService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService services;

    @RequestMapping("/products")
    public List<Product> getProduct(){
        return services.getProduct();
    }

    @GetMapping("/products/{prodId}")  //@RequestMapping is same as @GetMapping
    public Product getProductById(@PathVariable int prodId){
        return services.getProductById(prodId);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Product prod){
        services.addProduct(prod);
    }

    @PutMapping("/products")
    public void updateProduct(@RequestBody Product prod){
        services.updateProduct(prod);
    }

    @DeleteMapping("/products/{prodId}")
    public void deleteProduct(@PathVariable int prodId){
        services.deleteProduct(prodId);
    }
}
