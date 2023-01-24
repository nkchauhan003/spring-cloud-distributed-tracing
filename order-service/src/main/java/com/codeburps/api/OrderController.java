package com.codeburps.api;

import com.codeburps.dto.OrderDto;
import com.codeburps.model.Order;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/order")
public interface OrderController {
    @PostMapping(
            value = "/",
            consumes = "application/json")
    Order addOrder(@RequestBody OrderDto orderDto);
}
