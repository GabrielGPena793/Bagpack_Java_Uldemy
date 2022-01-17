package com.uldemy;

import java.util.Locale;
import java.util.Scanner;

public class Exercise06 {
/*    Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
    mostre:
    a) a área do triângulo retângulo que tem A por base e C por altura.
    b) a área do círculo de raio C. (pi = 3.14159)
    c) a área do trapézio que tem A e B por bases e C por altura.
    d) a área do quadrado que tem lado B.
    e) a área do retângulo que tem lados A e B.*/

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        double A, B, C;

        System.out.println("Digite o valor de A");
        A = scanner.nextDouble();
        System.out.println("Digite o valor de B");
        B = scanner.nextDouble();
        System.out.println("Digite o valor de C");
        C = scanner.nextDouble();

        double triangulo, circulo, trapezio, quadrado, rentangulo;

        triangulo = (A * C) / 2;
        circulo = Math.PI * Math.pow(C,2);
        trapezio = ((A+B) * C) / 2;
        quadrado = Math.pow(B, 2);
        rentangulo = A * B;

        System.out.printf("Triangulo: %.3f %n", triangulo);
        System.out.printf("Circulo: %.3f %n", circulo);
        System.out.printf("Trapezio: %.3f %n", trapezio);
        System.out.printf("Quadrado: %.3f %n", quadrado);
        System.out.printf("Rentangulo: %.3f %n", rentangulo);


    }
}
