package com.uldemy.application;

import com.uldemy.entities.Comment;
import com.uldemy.entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        System.out.println("Digite os dados da postagem: ");
        System.out.print("Data (dd/mm/yyyy HH:mm:ss): ");
        Date date = sdf.parse(scanner.nextLine());
        System.out.print("Titulo: ");
        String title = scanner.nextLine();
        System.out.print("Conteudo: ");
        String content = scanner.nextLine();
        System.out.print("Likes: ");
        int likes = scanner.nextInt();
        scanner.nextLine();

        Post post = new Post(date,title,content,likes);

        int response;
        do {
            System.out.println("Digite um comentário: ");
            String text = scanner.nextLine();
            Comment comment = new Comment(text);
            post.addComment(comment);

            System.out.println("""
                    Deseja fazer outro comentário?
                    1 - sim
                    2 - não
                    """);
            response = scanner.nextInt();
            scanner.nextLine();

        }while (response == 1);

        System.out.println(post);

    }
}
