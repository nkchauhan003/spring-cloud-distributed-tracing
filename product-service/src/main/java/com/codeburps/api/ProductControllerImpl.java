package com.codeburps.api;

import com.codeburps.model.Product;
import com.codeburps.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductControllerImpl implements ProductController {

    @Autowired
    private ProductService productService;

    @Override
    public Product getProduct(int productId) throws Exception {
        return productService.getProduct(productId);
    }
}
