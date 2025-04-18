
package com.frontalx.solid_principles.service;

import com.frontalx.solid_principles.model.Order;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    public void process(Order order) {
        System.out.println("Processed payment: ₹" + order.getTotalAmount());
    }
}
