package com.aor.refactoring.example1;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<OrderLine> lines;

    public Order() {
        lines = new ArrayList<>();
    }

    public void add(Product product, int quantity) {
        lines.add(new OrderLine(product, quantity));
    }

    public double getTotal() {
        double total = 0;
        for (OrderLine line : lines)
            total += line.getTotalPrice();
        return total;
    }

    public boolean isElegibleForFreeDelivery() {
        /*if (total > 100) return true; USELESS IF STATEMENT
        else return false;*/
        return getTotal() > 100;
    }

    public String printOrder() {
        StringBuilder printBuffer = new StringBuilder();

        for (OrderLine line : lines)
            printBuffer.append(line.getLine());

        printBuffer.append("Total: ").append(getTotal());

        return printBuffer.toString();
    }
}