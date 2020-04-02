package com.aor.refactoring.example3;

public class NULLDiscount implements Discount {
    public double applyDiscount(double price) {
        return price;
    }
}
