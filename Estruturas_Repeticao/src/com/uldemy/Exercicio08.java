package com.uldemy;

import java.util.Scanner;

/*
    Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
    Lembrando que, por definição, fatorial de 0 é 1.
*/

public class Exercicio08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N, fatorial;

        System.out.println("Digite um número:");
        N = scanner.nextInt();
        fatorial = N;

        if (N == 0) fatorial = 1;

        for (int i = 1; i < N; i++){

            fatorial = fatorial * (N-i);
        }

/*
        outra forma de calcular fatorial

        for (int i=1; i<=N; i++) {
            fatorial = fatorial * i;
        }
*/
        System.out.println(fatorial);
    }
}
