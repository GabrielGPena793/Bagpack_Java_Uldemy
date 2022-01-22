package com.uldemy.application;

import com.uldemy.entities.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class MainEmployee {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Employee> employees = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int quantityEmployees =  scanner.nextInt();
        System.out.println();

        for (int i = 0; i < quantityEmployees; i++){
            System.out.println("Emplyoee #" + (i+1) + ":");
            System.out.print("Id: ");
            Integer id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Salary: ");
            Double salaray = scanner.nextDouble();

            employees.add(new Employee(id,name,salaray));
            System.out.println();
        }

        System.out.print("Enter the employee id that will have salary increase : ");
        Integer id = scanner.nextInt();

        Employee employees1 = employees.stream().filter(employee -> employee.getId().equals(id)).findFirst().orElse(null);

        if (employees1 != null){
            System.out.print("Enter the percentage: ");
             Double porcentage = scanner.nextDouble();
             employees1.aumentoSalario(porcentage);
        }else {
            System.out.println("This id does not exist!");
        }

        System.out.println();
        System.out.println("List of employees:");
        for (Employee employee : employees){
            System.out.println(employee);
        }


    }


}
