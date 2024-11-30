package com.example.SimpleWebApp.services;

import com.example.SimpleWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    List<Product> product= new ArrayList<>(Arrays.asList(new Product(101,"Iphone",45678),
                                         new Product(102,"iQOO",23000),
                                          new Product(103,"Sonata",4567)));


    public List<Product> getProduct() {

        return product;
    }

    public Product getProductById(int prodId) {
        return product.stream()
                .filter(p->p.getProdId()==prodId)
                .findFirst().orElse(new Product(100,"No Item",0));
    }

    public void addProduct(Product prod){
        product.add(prod);
    }
}
