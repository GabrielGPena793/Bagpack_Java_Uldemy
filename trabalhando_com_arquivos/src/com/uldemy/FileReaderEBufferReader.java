package com.uldemy;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEBufferReader {

    public static void main(String[] args) {
        //forma básica para ver o processo manual

        String path = "c:\\temp\\in.txt";
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr); // deixa mais rapido a leitura

            String line = br.readLine();

            while (line != null){
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            try {
                if (br != null){
                    br.close();
                }
                if (fr != null){
                    fr.close();
                }
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }

    }
}
