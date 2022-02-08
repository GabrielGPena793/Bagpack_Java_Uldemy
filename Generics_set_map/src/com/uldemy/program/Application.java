package com.uldemy.program;

import com.uldemy.entities.Log;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Application {
    public static void main(String[] args) {

        String path = "c:\\temp\\in.txt";
        Set<Log> logs = new HashSet<>();

        try(BufferedReader bf = new BufferedReader(new FileReader(path))) {

            String line = bf.readLine();
            while (line != null){
                String[] fields = line.split(" ");
                Log log = new Log(fields[0], Date.from(Instant.parse(fields[1])));
                logs.add(log);
                line = bf.readLine();
            }

        }catch (IOException e){
            e.printStackTrace();
        }

        System.out.println("Total users: " + logs.size());
    }
}
