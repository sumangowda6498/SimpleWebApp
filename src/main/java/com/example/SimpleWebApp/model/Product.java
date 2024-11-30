package com.example.SimpleWebApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    private int prodId;
    private String ProdName;
    private int price;
}
