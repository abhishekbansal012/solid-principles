
package com.frontalx.solid_principles.discount;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class NoDiscount implements DiscountStrategy {
    public double applyDiscount(double total) {
        return total;
    }
}
