package com.uldemy.program;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Application {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Set<Integer> A = new HashSet<>();
        Set<Integer> B = new HashSet<>();
        Set<Integer> C = new HashSet<>();

        System.out.print("How many students for course A? ");
        int quantity = scanner.nextInt();

        for (int i = 0; i < quantity; i++){
            int number = scanner.nextInt();
            A.add(number);
        }

        System.out.print("How many students for course B? ");
        quantity = scanner.nextInt();

        for (int i = 0; i < quantity; i++){
            int number = scanner.nextInt();
            B.add(number);
        }

        System.out.print("How many students for course C? ");
        quantity = scanner.nextInt();

        for (int i = 0; i < quantity; i++){
            int number = scanner.nextInt();
            C.add(number);
        }

        A.addAll(B);
        A.addAll(C);

        System.out.printf("Total students: %d", A.size() );

    }
}
