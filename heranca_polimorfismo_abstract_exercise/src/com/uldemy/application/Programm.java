package com.uldemy.application;

import com.uldemy.entities.Pessoa;
import com.uldemy.entities.PessoaFisica;
import com.uldemy.entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programm {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        List<Pessoa> pessoas = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int payers = scanner.nextInt();

        for (int i = 1; i <= payers; i++){
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char type = scanner.next().charAt(0);
            scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Anual income: ");
            Double anualIcnome = scanner.nextDouble();

            if (type == 'i'){
                System.out.print("Health expenditures: ");
                Double expenditures = scanner.nextDouble();
                pessoas.add( new PessoaFisica(name, anualIcnome, expenditures));

            }else {
                System.out.print("Number of employees: ");
                int employees = scanner.nextInt();
                pessoas.add(new PessoaJuridica(name,anualIcnome, employees));
            }
        }

        System.out.println();

        System.out.println("TAXES PAID:");
        for (Pessoa p : pessoas) {
            System.out.println(p);
        }

        System.out.println();

        double sum = 0;
        for (Pessoa p : pessoas) {
            sum += p.calculoImposto();
        }
        System.out.printf("TOTAL TAXES: $ %.2f" , sum);
    }
}
