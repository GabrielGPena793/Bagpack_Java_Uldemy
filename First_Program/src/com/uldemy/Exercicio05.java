package com.uldemy;

import java.util.*;

public class Exercicio05 {

/*    Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
    código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago*/

    public static void main(String[] args) {
        Map<Integer, Double> carrinho = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int codigo;
        double valor;
        int resposta, pecas;

        do {
            System.out.println("Digite o código da peça:");
            codigo = scanner.nextInt();
            System.out.println("quantidade de peças:");
            pecas = scanner.nextInt();
            System.out.println("Valor unitário da peça:");
            valor = scanner.nextDouble();

            carrinho.put(codigo, valor * pecas);

            System.out.println("Deseja adicionar outro produto?");
            System.out.println("""
                1 - sim
                1 - não
                """);
            resposta = scanner.nextInt();
        }while (resposta != 2);

        Collection<Double> valores =  carrinho.values();
        double valorPagar = 0;

        for (Double preco: valores) {
            valorPagar += preco;
        }

        System.out.printf("Valor a pagar: R$ %.2f", valorPagar);

    }
}
