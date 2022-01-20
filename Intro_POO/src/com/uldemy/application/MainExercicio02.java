package com.uldemy.application;

import com.uldemy.entities.Employee;

import java.util.Locale;
import java.util.Scanner;

/*      Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em
        seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o
        salário do funcionário com base em uma porcentagem dada (somente o salário bruto é
        afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe
        projetada abaixo.
        */

public class MainExercicio02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.println("Digite os dados do funcionário:");
        System.out.print("Name: ");
        employee.setName(scanner.nextLine());
        System.out.print("Salário Bruto: ");
        employee.setGrossSalary(scanner.nextDouble());
        System.out.print("Imposto: ");
        employee.setTax(scanner.nextDouble());

        System.out.println();
        System.out.println(employee);

        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        employee.increaseSalary(scanner.nextDouble());

        System.out.println();
        System.out.printf("Upadated data: %s, $ %.2f", employee.getName(), employee.netSalary());
    }
}
