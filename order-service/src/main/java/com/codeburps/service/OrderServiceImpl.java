package com.codeburps.service;

import com.codeburps.client.product.ProductClient;
import com.codeburps.dto.OrderDto;
import com.codeburps.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.ThreadLocalRandom;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private ProductClient productClient;

    @Override
    public Order placeOrder(OrderDto orderDto) {
        var customerId = ThreadLocalRandom.current().nextInt(100, 200 + 1);

        double orderValue = 0.0;
        for (var item : orderDto.getItems()) {

            var product = productClient.getProduct(item.getProductId());
            if (product != null)
                orderValue += product.getPrice() * item.getQuantity();
        }
        var order = new Order(customerId, orderDto.getItems(), orderValue);
        return order;
    }
}
