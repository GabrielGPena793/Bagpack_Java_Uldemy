package com.uldemy;

import java.util.Scanner;

    /*
        Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
        seguir, calcule e mostre o valor da conta a pagar.
     */
public class Exercicio05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int codigoProduto, quantidade;
        double precoTotal = 0;

        System.out.println("Digite o código do produto:");
        System.out.println("""
                ==================================
                Codigo |     Produto     |   Preço
                   1   | Cachorro quente | R$ 4,00
                   2   |    X-Salada     | R$ 4,50
                   3   |    X-Bacon      | R$ 5,00
                   4   | Torrada Simples | R$ 2,00
                   5   |  Refrigerante   | R$ 1,50
                ==================================
                """);
        codigoProduto = scanner.nextInt();

        System.out.println("Quantos deseja:");
        quantidade = scanner.nextInt();

        switch (codigoProduto){
            case 1 -> precoTotal = 4.00 * quantidade;
            case 2 -> precoTotal = 4.50 * quantidade;
            case 3 -> precoTotal = 5.00 * quantidade;
            case 4 -> precoTotal = 2.00 * quantidade;
            case 5 -> precoTotal = 1.50 * quantidade;
        }

        System.out.printf("Total: R$ %.2f", precoTotal);
    }
}
