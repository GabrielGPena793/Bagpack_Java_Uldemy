package com.uldemy.application;

import com.uldemy.model.entities.Account;
import com.uldemy.model.exceptions.WithdrawException;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        try {
            Locale.setDefault(Locale.US);
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Holder: ");
            String holder = scanner.nextLine();
            System.out.print("Initial balance: ");
            Double balance = scanner.nextDouble();
            System.out.print("Withdraw limit: ");
            Double limit = scanner.nextDouble();

            Account account = new Account(number,holder,balance,limit);

            System.out.println();
            System.out.print("Enter amount for withdraw: ");
            Double withdraw = scanner.nextDouble();
            account.withdraw(withdraw);
            System.out.println("New balance: " + String.format("%.2f", account.getBalance()));

        }catch (WithdrawException e){
            System.out.println("Withdraw error: " + e.getMessage());
        }catch (InputMismatchException e){
            System.out.println("Digite apenas números nos campos de números!");
        }
    }
}
