
package com.frontalx.solid_principles.service;

import com.frontalx.solid_principles.model.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderValidator {
    public void validate(Order order) {
        if (order.getItems().isEmpty()) {
            throw new IllegalArgumentException("Order must have items");
        }
    }
}
