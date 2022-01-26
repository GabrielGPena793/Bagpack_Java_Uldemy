package com.uldemy.application;

import com.uldemy.entities.ImportedProduct;
import com.uldemy.entities.Product;
import com.uldemy.entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class programm {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        List<Product> products = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++){
            System.out.println("Product #" + (i+1)+ " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char infoProduct = scanner.next().charAt(0);
            scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Price: ");
            Double price = scanner.nextDouble();

            if (infoProduct == 'i' || infoProduct == 'I'){
                System.out.print("Customs fee: ");
                Double customsFee = scanner.nextDouble();
                products.add(new ImportedProduct(name, price, customsFee)) ;

            }else  if(infoProduct == 'u' || infoProduct == 'U'){
                scanner.nextLine();
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date date = sdf.parse(scanner.nextLine());
                products.add(new UsedProduct(name, price, date));

            }else {
                products.add(new Product(name, price));
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS:");
        for (Product product: products){
            System.out.println(product.priceTag());
        }

    }
}
