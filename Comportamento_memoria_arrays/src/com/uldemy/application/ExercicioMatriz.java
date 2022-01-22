package com.uldemy.application;

import java.util.Scanner;

public class ExercicioMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite dois números inteiros: ");
        int M = scanner.nextInt();
        int N = scanner.nextInt();

        int[][] matriz = new int[M][N];

        System.out.println("Digite os números da matriz: ");
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.println("Linha: " + i + ", Posição: " + j );
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Número referência: ");
        int X = scanner.nextInt();


        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == X){
                    System.out.println("Position: " + i + ", " + j);
                    if (j > 0){
                        System.out.println("Left: " + matriz[i][j-1]);
                    }
                    if (j < matriz[i].length -1){
                        System.out.println("Right: " + matriz[i][j+1]);
                    }
                    if (i > 0){
                        System.out.println("Up: " + matriz[i-1][j]);
                    }
                    if (i < matriz.length - 1){
                        System.out.println("Down: " + matriz[i+1][j]);
                    }
                }
            }
        }



    }
}
