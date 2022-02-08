package com.uldemy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter file full path: ");
        String path = scanner.nextLine();

        try(BufferedReader bf = new BufferedReader(new FileReader(path))) {

            String line = bf.readLine();
            Map<String, Integer> voting = new LinkedHashMap<>();

            while (line != null){

                String[] fields = line.split(",");

                if (voting.containsKey(fields[0])){

                    int addVoting = voting.get(fields[0]) + Integer.parseInt(fields[1]);
                    voting.put(fields[0], addVoting);

                }else {
                    voting.put(fields[0], Integer.parseInt(fields[1]));
                }

                line = bf.readLine();
            }

            for (String candidate : voting.keySet()){
                System.out.println( candidate + ": " + voting.get(candidate));
            }

        }
        catch (IOException e){
            System.out.println("Error read : " + e.getMessage());
        }
    }
}
