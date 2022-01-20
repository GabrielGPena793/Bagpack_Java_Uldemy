package com.uldemy.application;

import com.uldemy.entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class MainExercicio01 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width and height");
        rectangle.setWidth(scanner.nextDouble());
        rectangle.setHeight(scanner.nextDouble());

        System.out.printf("Area = %.2f %n", rectangle.area());
        System.out.printf("Perimeter = %.2f %n", rectangle.perimeter());
        System.out.printf("Diagonal = %.2f %n", rectangle.diagonal());
    }
}
