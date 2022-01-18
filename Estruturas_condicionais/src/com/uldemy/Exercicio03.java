package com.uldemy;

import java.util.Scanner;

    /*
        Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
        Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
        ordem crescente ou decrescente
     */
public class Exercicio03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A ,B;

        System.out.println("Digite dois números:");
        A = scanner.nextInt();
        B = scanner.nextInt();

        if (A % B == 0 || B % A == 0)
            System.out.println("São multiplos!");
        else
            System.out.println("Não são multiplos");

    }
}
