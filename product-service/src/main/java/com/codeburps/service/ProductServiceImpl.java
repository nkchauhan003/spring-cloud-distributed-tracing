package com.codeburps.service;

import com.codeburps.model.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    @Override
    public Product getProduct(int productId) {
        return new Product(productId, "name-" + productId, (Math.random() * (500 - 50)) + 50);
    }
}
