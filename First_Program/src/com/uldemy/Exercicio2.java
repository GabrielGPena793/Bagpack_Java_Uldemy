package com.uldemy;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        int valor1 , valor2, soma;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite dois valores inteiros");
        valor1 = scanner.nextInt();
        valor2 = scanner.nextInt();

        soma = valor1 + valor2;

        System.out.printf("Soma = %d", soma);

    }
}
