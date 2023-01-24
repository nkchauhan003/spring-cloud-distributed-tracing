package com.codeburps.service;

import com.codeburps.dto.OrderDto;
import com.codeburps.model.Order;

public interface OrderService {
    public Order placeOrder(OrderDto orderDto);
}
