package com.uldemy;

import java.util.Scanner;

    /*
        Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
        começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas
     */

public class Exercicio04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int inicio, fim;
        int horaMaxima = 24;
        int duracao;

        System.out.println("Digite a hora inicial do jogo:");
        inicio = scanner.nextInt();
        System.out.println("Digite a hora final do jogo:");
        fim = scanner.nextInt();

        if (inicio >= fim){
            duracao = horaMaxima - inicio + fim;
        }
        else{
            duracao = fim - inicio;
        }

        System.out.printf("O jogo durou %d Hora(s) %n", duracao);

    }
}
