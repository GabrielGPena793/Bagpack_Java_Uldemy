package com.uldemy;

import java.util.Locale;

public class Main {
/*

    %f = ponto flutuante
    %d = inteiro
    %s = texto
    %n = quebra de linha
*/
    public static void main(String[] args) {

        double y = 10.300556;
        String name = "Maria";
        int number = 20;
        System.out.printf("%.2f%n",y);
        System.out.printf("%.4f%n",y);
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n",y);

        System.out.printf("Resultado  %.2f %s %n", y, number);

        System.out.printf("%s tem %d anos e ganha R$ %.2f %n", name, number, y);

    }
}
