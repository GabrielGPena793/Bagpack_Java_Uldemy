package com.uldemy;

/*
    Fazer um programa para ler o caminho de um arquivo .csv
    contendo os dados de itens vendidos. Cada item possui um
    nome, preço unitário e quantidade, separados por vírgula. Você
    deve gerar um novo arquivo chamado "summary.csv", localizado
    em uma subpasta chamada "out" a partir da pasta original do
    arquivo de origem, contendo apenas o nome e o valor total para
    aquele item (preço unitário multiplicado pela quantidade),
    conforme exemplo.
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        List<Produto> produtos = new ArrayList<>();

        System.out.println("Enter file path: ");
        String strPath = scanner.nextLine();

        File path = new File(strPath);
        String subPath = path.getParent();

        boolean sucess = new File(subPath + "\\out").mkdir();

        String pathTarget = subPath + "\\out\\summary.csv";

        try(BufferedReader br = new BufferedReader(new FileReader(strPath)) ){

            String line = br.readLine();

            while (line != null){
                String[] infosProduct = line.split(",");
                produtos.add(new Produto(infosProduct[0], Double.parseDouble(infosProduct[1]), Integer.parseInt(infosProduct[2])));

                line = br.readLine();
            }

            try(BufferedWriter bw = new BufferedWriter(new FileWriter(pathTarget))) {

                for (Produto produto : produtos){
                    bw.write(produto.getNome() + ", " + String.format("%.2f", produto.total()));
                    bw.newLine();
                }

                System.out.println(pathTarget + " CREATED!");

            } catch (IOException e){
                System.out.println("Error writing file: " + e.getMessage());
            }

        }
        catch (IOException e){
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
