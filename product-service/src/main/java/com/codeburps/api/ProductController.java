package com.codeburps.api;

import com.codeburps.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/product")
public interface ProductController {
    @GetMapping(
            value = "/{productId}",
            produces = "application/json")
    Product getProduct(@PathVariable int productId) throws Exception;

}
