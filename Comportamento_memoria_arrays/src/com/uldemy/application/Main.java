package com.uldemy.application;

import com.uldemy.entities.Estudante;
import com.uldemy.entities.Quarto;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Quarto quarto  = new Quarto();
        Estudante estudante ;

        System.out.print("How many rooms will be rented? ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++){
            scanner.nextLine();
            System.out.println("Rent #" + (i +1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();
            System.out.print("Room: ");
            int room = scanner.nextInt();
            estudante =  new Estudante(name,email) ;
            quarto.addEstudante(room, estudante);
            System.out.println();
        }

        System.out.println("Busy rooms:");
        quarto.quartosAlugados();

    }
}
