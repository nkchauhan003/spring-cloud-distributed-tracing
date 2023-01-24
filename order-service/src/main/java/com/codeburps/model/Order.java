package com.codeburps.model;
import lombok.Data;

import java.util.List;

@Data
public class Order {
    private int orderId;
    private int customerId;
    private List<Item> items;
    private double value;

    public Order(int customerId, List<Item> items, double value) {
        this.customerId = customerId;
        this.items = items;
        this.value = value;
    }
}
