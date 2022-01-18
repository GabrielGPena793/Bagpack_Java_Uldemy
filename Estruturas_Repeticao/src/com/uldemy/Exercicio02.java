package com.uldemy;

    /*Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
      cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
      menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma)
      */

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int X, Y;

        do{
            System.out.println("Digite o valor X e Y");
            X = scanner.nextInt();
            Y = scanner.nextInt();

            if (X > 0 && Y > 0)
                System.out.println("Primeiro");
            else if (X < 0 && Y > 0)
                System.out.println("Segundo");
            else if (X < 0 && Y < 0)
                System.out.println("Terceiro");
            else if (X > 0 && Y < 0)
                System.out.println("Quarto");

        }while (X != 0 && Y != 0);
    }
}
