package com.codeburps.dto;

import com.codeburps.model.Item;
import lombok.Data;

import java.util.List;

@Data
public class OrderDto {
    private int customerId;
    // productId > quantity
    private List<Item> items;
}
