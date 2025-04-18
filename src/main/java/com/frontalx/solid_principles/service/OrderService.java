
package com.frontalx.solid_principles.service;

import com.frontalx.solid_principles.discount.DiscountStrategy;
import com.frontalx.solid_principles.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired private OrderValidator validator;
    @Autowired private PaymentService payment;
    @Autowired private NotificationService notification;
    @Autowired private DiscountStrategy discount;

    public void placeOrder(Order order) {
        validator.validate(order);
        double discounted = discount.applyDiscount(order.getTotalAmount());
        System.out.println("Total after discount: ₹" + discounted);
        payment.process(order);
        notification.notifyCustomer(order);
    }
}
