package com.uldemy.application;

import com.uldemy.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        String path = scanner.nextLine();
        System.out.print("Enter Salary: ");
        Double salary = scanner.nextDouble();

        try (BufferedReader bf = new BufferedReader(new FileReader(path))) {

            List<Employee> employees = new ArrayList<>();

            String line = bf.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                Employee employee = new Employee(fields[0], fields[1], Double.parseDouble(fields[2]));
                employees.add(employee);

                line = bf.readLine();
            }

            // ordem alfabética, o email dos uncionários cujo salário seja superior a um dado valor
            //fornecido pelo usuário.
            List<String> emails = employees.stream()
                    .filter(emp -> emp.getSalary() > salary)
                    .map(Employee::getEmail)
                    .sorted(Comparator.comparing(String::toUpperCase)).toList();
            System.out.println("Email of people whose salary is more than " + String.format("%.2f",salary) + ":");
            emails.forEach(System.out::println);

            //soma dos salários dos funcionários cujo nome começa com a letra 'M'.
            Double sum = employees.stream()
                    .filter(employee -> employee.getName().charAt(0) == 'M')
                    .map(Employee::getSalary)
                    .reduce(0.0, Double::sum);
            System.out.printf("Sum of salary of people whose name with 'M': %.2f ", sum);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
