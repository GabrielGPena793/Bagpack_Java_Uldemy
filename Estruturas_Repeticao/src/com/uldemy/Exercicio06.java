package com.uldemy;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int N;
        double entrada, valor1 = 0, valor2 = 0, valor3 = 0;

        System.out.println("Digite o número de vezes");
        N = scanner.nextInt();

        for (int i = 1; i <= N; i++){
            System.out.println("Digite um valor:");
            entrada = scanner.nextDouble();

            switch (i){
                case 1 -> valor1 = 2 * entrada;
                case 2 -> valor2 = 3 * entrada;
                case 3 -> valor3 = 5 * entrada;
            }
        }

        double mediaPonderada = (valor1 + valor2 + valor3) / 10;

        System.out.printf("%.1f",mediaPonderada);
    }
}
