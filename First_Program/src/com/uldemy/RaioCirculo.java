package com.uldemy;

import java.util.Locale;
import java.util.Scanner;

public class RaioCirculo {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double valorArea, raio;

        System.out.println("Digite o raio do circulo");
        raio = scanner.nextDouble();

        valorArea = Math.PI * Math.pow(raio, 2);

        System.out.printf("A = %.4f%n", valorArea);
    }
}
