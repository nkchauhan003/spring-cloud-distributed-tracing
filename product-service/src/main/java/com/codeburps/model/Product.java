package com.codeburps.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class Product {
    private int productId;
    private String name;
    private double price;
}

