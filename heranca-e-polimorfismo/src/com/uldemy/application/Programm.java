package com.uldemy.application;

import com.uldemy.entities.Employee;
import com.uldemy.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programm {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int numberEmployees = scanner.nextInt();

        for (int i = 0; i < numberEmployees; i++){
            scanner.nextLine();
            System.out.println("Employee #"+ (i+1) + " data: ");
            System.out.print("Outsourced (y/n)? ");
            char outsourced = scanner.nextLine().charAt(0);
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Hours: ");
            Integer hours = scanner.nextInt();
            System.out.print("Value per hour: ");
            Double valueHour = scanner.nextDouble();

            if (outsourced == 'n' || outsourced == 'N' ){
                employees.add(new Employee(name,hours,valueHour));
            }else {
                System.out.print("Additional charge: ");
                Double additional = scanner.nextDouble();
                employees.add(new OutsourcedEmployee(name,hours,valueHour, additional));
            }
        }

        System.out.println();
        System.out.println("PAYMENTS:");
        for (Employee employee: employees) {
            System.out.println(employee);
        }

    }
}
