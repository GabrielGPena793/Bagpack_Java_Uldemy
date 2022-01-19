package com.uldemy;

import java.util.Scanner;

/*
        Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
        Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
        essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
*/

public class Exercicio05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N, X, in=0, out=0;

        System.out.println("Digite a quantidade de entradas:");
        N = scanner.nextInt();

        for (int i = 0; i < N; i++){
            System.out.println("Digite um número");
            X = scanner.nextInt();

            if (X >= 10 && X <= 20)
                in++;
            else
                out++;
        }

        System.out.printf("%d in %n", in);
        System.out.printf("%d out %n", out);
    }
}
