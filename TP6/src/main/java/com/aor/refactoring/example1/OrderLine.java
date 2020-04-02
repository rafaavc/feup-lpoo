package com.aor.refactoring.example1;


public class OrderLine {
    /*public Product product;   THIS WOULD BE A DATA CLASS
    public int quantity;*/

    private Product product;
    private int quantity;

    public OrderLine(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getLine() {
        return getProduct().getName() + "(x" + getQuantity() + "): " + (getTotalPrice()) + "\n";
    }

    /*
    * This operation was being repeated many times outside,
    * this makes it more consistent
    * */
    public double getTotalPrice() {
        return product.getPrice()*quantity;
    }
}
