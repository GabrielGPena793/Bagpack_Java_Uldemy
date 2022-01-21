package com.uldemy.entities;

public class Conta {
    private int numero;
    private String titular;
    private double saldo;

    public Conta(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }

    public Conta(int numero, String titular, double depositoIncial) {
        this.numero = numero;
        this.titular = titular;
        deposito(depositoIncial);
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposito(double valor){
        this.saldo += valor;
    }

    public void saque(double valor){
        double ValorComtaxa = valor + 5;
        this.saldo -= ValorComtaxa;
 /*
        if (this.saldo >= ValorComtaxa){
            this.saldo -= ValorComtaxa;
        }else {
            System.out.println("Não tem saldo suficiente");
        }*/

    }

    @Override
    public String toString() {
        return "Account "
                + this.numero
                +", Holder: "
                + this.titular
                + ", Balance: $ "
                + String.format("%.2f", this.saldo);
    }
}
