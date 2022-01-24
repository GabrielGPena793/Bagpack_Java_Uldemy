package com.uldemy.application;

import com.uldemy.entitites.Client;
import com.uldemy.entitites.Order;
import com.uldemy.entitites.OrderItem;
import com.uldemy.entitites.Product;
import com.uldemy.entitites.enuns.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter Cliente data:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date date = sdf1.parse(scanner.next());
        scanner.nextLine();

        Client client = new Client(name,email,date);

        System.out.println("Enter Order data:");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(scanner.nextLine());
        System.out.print("How many items to this order: ");
        int qtd = scanner.nextInt();
        scanner.nextLine();
        Order order = new Order(status, client);

        for (int i = 0; i < qtd; i++){
            System.out.println("Enter #" +(i+1)+ " item data:");
            System.out.print("Product name: ");
            String itemName = scanner.nextLine();
            System.out.print("Product price: ");
            Double itemPrice = scanner.nextDouble();
            System.out.print("Quantity: ");
            Integer quantity = scanner.nextInt();
            scanner.nextLine();

            Product product = new Product(itemName, itemPrice);
            OrderItem orderItem = new OrderItem(quantity, product);
            order.addItem(orderItem);
        }

        System.out.println();
        System.out.println(order);



    }
}
