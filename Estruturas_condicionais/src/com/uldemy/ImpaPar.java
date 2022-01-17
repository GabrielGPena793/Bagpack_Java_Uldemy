package com.uldemy;

import java.util.Scanner;

//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
public class ImpaPar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.println("Digite um número inteiro:");
        numero = scanner.nextInt();

        if (numero % 2 == 0) System.out.println("Par");
        else System.out.println("Impar");
    }

}
