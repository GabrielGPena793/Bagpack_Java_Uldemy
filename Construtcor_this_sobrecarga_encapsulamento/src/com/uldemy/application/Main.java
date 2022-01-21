package com.uldemy.application;

import com.uldemy.entities.Conta;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Conta conta;

        System.out.print("Enter account number: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter account holder: ");
        String holder = scanner.nextLine();

        System.out.print("Is there na initial deposit (y/n)? ");
        char response = scanner.next().charAt(0);

        if (response == 'y'){
            System.out.print("Enter initial deposit value: ");
            double value = scanner.nextDouble();
            conta = new Conta(number, holder, value);
        }else {
            conta = new Conta(number, holder);
        }

        System.out.println("Account data:");
        System.out.println(conta);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        conta.deposito(scanner.nextDouble());
        System.out.println("Updated account data:");
        System.out.println(conta);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        conta.saque(scanner.nextDouble());
        System.out.println("Updated account data:");
        System.out.println(conta);





    }
}
