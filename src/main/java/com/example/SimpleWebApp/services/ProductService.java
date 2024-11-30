package com.example.SimpleWebApp.services;

import com.example.SimpleWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    List<Product> product= Arrays.asList(new Product(101,"Iphone",45678),
                                         new Product(102,"iQOO",23000),
                                          new Product(103,"Sonata",4567));


    public List<Product> getProduct() {

        return product;
    }
}
