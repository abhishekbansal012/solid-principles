
package com.frontalx.solid_principles.model;

import java.util.List;

public class Order {
    private List<String> items;
    private double totalAmount;
    private String customerEmail;

    public Order(List<String> items, double totalAmount, String customerEmail) {
        this.items = items;
        this.totalAmount = totalAmount;
        this.customerEmail = customerEmail;
    }

    public List<String> getItems() { return items; }
    public double getTotalAmount() { return totalAmount; }
    public String getCustomerEmail() { return customerEmail; }
}
