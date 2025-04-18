
package com.frontalx.solid_principles.service;

import com.frontalx.solid_principles.model.Order;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {
    public void notifyCustomer(Order order) {
        System.out.println("Email sent to: " + order.getCustomerEmail());
    }
}
