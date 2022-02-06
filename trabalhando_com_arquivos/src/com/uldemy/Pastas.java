package com.uldemy;

import java.io.File;
import java.util.Scanner;

public class Pastas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String strPath = scanner.nextLine();

        File path = new File(strPath);

        //me retorna um vetor com as pastas do diretório
        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("FOLDERS: ");
        for (File folder : folders){
            System.out.println(folder);
        }

        //me retorna um vetor de arquivos do diretório
        File[] files = path.listFiles(File::isFile);
        System.out.println("FILES: ");
        for (File file : files){
            System.out.println(file);
        }

        //Cria uma pasta no diretório
        boolean sucess = new File(strPath + "\\subdir").mkdir();
        System.out.println("Directory created sucessfully: " + sucess);



    }
}
