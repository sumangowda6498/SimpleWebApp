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

    public void updateProduct(Product prod) {
        int index=0;
        for(int i=0;i<product.size();i++){
            if(product.get(i).getProdId()==prod.getProdId()){
                index=i;
                product.set(index,prod);
            }
        }
    }

    public void deleteProduct(int prodId) {
        int index=0;
        for(int i=0;i<product.size();i++){
            if(product.get(i).getProdId()==prodId){
                index=i;
                product.remove(index);
            }
    }
}}
