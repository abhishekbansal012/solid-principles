
package com.frontalx.solid_principles.controller;

import com.frontalx.solid_principles.model.Order;
import com.frontalx.solid_principles.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/place")
    public String placeOrder() {
        Order order = new Order(
                Arrays.asList("Phone", "Charger"),
                12000,
                "user@example.com"
        );
        orderService.placeOrder(order);
        return "Order placed successfully!";
    }
}
