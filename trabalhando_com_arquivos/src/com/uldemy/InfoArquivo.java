package com.uldemy;

import java.io.File;
import java.util.Scanner;

public class InfoArquivo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String strPath = scanner.nextLine();

        File path = new File(strPath);

        System.out.println("getName: " + path.getName()); //apenas o nome
        System.out.println("getParent: " + path.getParent()); // caminho até o arquivo
        System.out.println("getPath: " + path.getPath()); // caminho completo
    }
}
