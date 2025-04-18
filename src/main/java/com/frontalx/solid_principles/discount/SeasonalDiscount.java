
package com.frontalx.solid_principles.discount;

import org.springframework.stereotype.Component;

@Component
public class SeasonalDiscount implements DiscountStrategy {
    public double applyDiscount(double total) {
        return total * 0.9;
    }
}
