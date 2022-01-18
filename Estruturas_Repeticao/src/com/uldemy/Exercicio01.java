package com.uldemy;

import java.util.Scanner;
    /*
        Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
        incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
        impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
    */

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int senha;
        senha = scanner.nextInt();
        while (senha != 2002){
            System.out.println("Senha invalida");
            System.out.println("Digite novamente a senha");
            senha = scanner.nextInt();
        }

        System.out.println("Acesso permitido!");
    }
}
