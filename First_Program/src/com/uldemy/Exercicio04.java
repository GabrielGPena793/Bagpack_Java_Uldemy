package com.uldemy;

import java.util.Locale;
import java.util.Scanner;

/*
        Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
        hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
        decimais
 */
public class Exercicio04 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int numeroId, horasTrabalhadas;
        double valorHora, salario;

        System.out.println("Digite o número do funcionario:");
        numeroId = scanner.nextInt();
        System.out.println("Horas que trabalhou:");
        horasTrabalhadas = scanner.nextInt();
        System.out.println("Quanto recebe por hora?");
        valorHora = scanner.nextDouble();

        salario = horasTrabalhadas * valorHora;

        System.out.printf("Number = %d %n", numeroId);
        System.out.printf("Salary = U$ %.2f", salario);

    }
}
