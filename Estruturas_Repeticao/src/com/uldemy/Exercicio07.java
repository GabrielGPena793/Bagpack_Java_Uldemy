package com.uldemy;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;

        System.out.println("Digite a quantidade de vezes:");
        N = scanner.nextInt();

        for (int i = 0; i < N; i++){
            System.out.println("Digite 2 números:");
            double n1 = scanner.nextInt();
            double n2 = scanner.nextInt();

            if (n2 == 0){
                System.out.println("Divisão impossivel");
                continue;
            }

            System.out.printf("%.1f%n", n1/n2);
        }
    }
}
