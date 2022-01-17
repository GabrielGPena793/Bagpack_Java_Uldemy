package com.uldemy;

import java.util.Locale;
import java.util.Scanner;

/*
    Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
    de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D)
*/

public class Ler4Valores {


    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int A, B, C, D, diferenca;

        System.out.println("Digite 4 números:");
        A = scanner.nextInt();
        B = scanner.nextInt();
        C = scanner.nextInt();
        D = scanner.nextInt();

        diferenca = A * B - C *D;

        System.out.printf("Diferença = %d" , diferenca);


    }
}
