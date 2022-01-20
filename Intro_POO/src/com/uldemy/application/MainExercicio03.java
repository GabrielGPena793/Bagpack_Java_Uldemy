package com.uldemy.application;

import com.uldemy.entities.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class MainExercicio03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Digite os dados do aluno:");
        System.out.print("Nome: ");
        aluno.setNome(scanner.nextLine());
        System.out.print("Nota Primeiro Trimestre: ");
        aluno.setNota1(scanner.nextDouble());
        System.out.print("Nota Segundo Trimestre: ");
        aluno.setNota2(scanner.nextDouble());
        System.out.print("Nota Terceiro Trimestre: ");
        aluno.setNota3(scanner.nextDouble());

        aluno.resultado();
    }
}
