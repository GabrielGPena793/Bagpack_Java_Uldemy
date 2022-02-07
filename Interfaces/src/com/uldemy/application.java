package com.uldemy;

import com.uldemy.entities.Contract;
import com.uldemy.entities.Installment;
import com.uldemy.services.ContractService;
import com.uldemy.services.PaypalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class application {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter contract data");
        System.out.print("Number: ");
        Integer number = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Date (dd/MM/yyyy): ");
        Date date = sdf.parse(scanner.nextLine());
        System.out.print("Contract value: ");
        Double value = scanner.nextDouble();

        Contract contract = new Contract(number, date, value);

        System.out.print("Enter number of installments: ");
        Integer installmentsNumber = scanner.nextInt();

        ContractService contractService = new ContractService(new PaypalService());
        contractService.processContract(contract, installmentsNumber);

        System.out.println("Installments: ");
        for (Installment installment : contract.getInstallments()){
            System.out.println(sdf.format(installment.getDueDate()) + " - " + String.format("%.2f", installment.getAmount()));
        }
    }
}
