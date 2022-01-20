package com.uldemy.entities;

public class Produto {
    private String name;
    private double price;
    private int quantity;

    public Produto() {
    }

    public Produto(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getNome() {
        return name;
    }

    public void setNome(String nome) {
        this.name = nome;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double totalValueInStock() {
        return this.price * this.quantity ;
    }

    public void addProducts(int quantity){
        this.quantity += quantity;
        dadosProduto();
    }

    public void removeProductis(int quantity){
        this.quantity -= quantity;
        dadosProduto();
    }

    public void dadosProduto() {
        System.out.println("Product data: " + this.name + ", $ " + String.format("%.2f", this.price) + ", " + this.quantity + " units, Total: $ " + String.format("%.2f",totalValueInStock()));
    }
}
