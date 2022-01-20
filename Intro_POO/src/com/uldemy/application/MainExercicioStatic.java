package com.uldemy.application;

import com.uldemy.util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class MainExercicioStatic {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double priceDolar = scanner.nextDouble();

        System.out.print("How many dollars will be bought? ");
        double quantityDolar = scanner.nextDouble();

        double total = CurrencyConverter.converterDolar(priceDolar,quantityDolar);
        System.out.printf("Amount to be paid in reais = %.2f", total);
    }
}
