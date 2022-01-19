package com.uldemy;

import java.util.Scanner;

/*
        Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
        X, se for o caso.
    */
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor:");
        int numero = scanner.nextInt();

        for (int i = 1; i <= numero; i++){

            if (i % 2 != 0)
                System.out.println(i);
        }

    }
}
