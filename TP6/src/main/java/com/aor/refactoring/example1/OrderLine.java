package com.aor.refactoring.example1;


public class OrderLine {
    private String name;
    private double price;
    private int quantity;

    public OrderLine(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getLine() {
        return name + "(x" + quantity + "): " + getTotalPrice() + "\n";
    }

    public double getTotalPrice() {
        return price*quantity;
    }
}
