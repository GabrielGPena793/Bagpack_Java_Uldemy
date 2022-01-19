package com.uldemy;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int entradaCliente;
        int alcool = 0, gasolina = 0, diesel = 0;

        do {
            System.out.println("""
                    Escolha o tipo de combustivel
                    1 - Álcool
                    2 - Gasolina
                    3 - Diesel
                    4 - Fim
                    """);
            entradaCliente = scanner.nextInt();

            if (entradaCliente == 1 ) alcool++;
            else if (entradaCliente == 2 )gasolina++;
            else if (entradaCliente == 3 ) diesel++;

        }while (entradaCliente != 4);

        System.out.println("Muito Obrigado!");
        System.out.println("Álcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
    }
}
