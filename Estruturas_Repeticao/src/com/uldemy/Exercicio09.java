package com.uldemy;

//Ler um número inteiro N e calcular todos os seus divisores.


import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        System.out.println("Digite um número:");
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++){

            if (n % i == 0){
                System.out.println(i);
            }
        }
    }
}
