package com.codeburps.client.product;

import com.codeburps.client.product.model.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Component
@Slf4j
public class ProductClientImpl implements ProductClient {

    @Value("${api.catalog.baseurl}")
    private String apiBaseUrl;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public Product getProduct(int productId) {
        var product = restTemplate.getForObject(apiBaseUrl + "/product/" + productId, Product.class);
        return product;
    }
}
