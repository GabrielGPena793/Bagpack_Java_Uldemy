package com.uldemy.entitites;

public class OrderItem {

    private Integer quantity;
    private Double price;
    private Product product;

    public OrderItem() {
    }

    public OrderItem(Integer quantity, Product product) {
        this.quantity = quantity;
        this.product = product;
        this.price = subTotal();
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public  Double subTotal(){
        return product.getPrice() * quantity;

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(product.getName()).append(", $");
        sb.append(String.format("%.2f",product.getPrice())).append(", ");
        sb.append("Quantity: ").append(quantity).append(", ");
        sb.append("Subtotal: ").append(String.format("%.2f", price));

        return sb.toString();
    }
}
