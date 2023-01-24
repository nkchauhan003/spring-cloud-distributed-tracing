package com.codeburps.api;

import com.codeburps.dto.OrderDto;
import com.codeburps.model.Order;
import com.codeburps.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class OrderControllerImpl implements OrderController {

    @Autowired
    private OrderService orderService;

    @Override
    public Order addOrder(OrderDto orderDto) {
        return orderService.placeOrder(orderDto);
    }
}
