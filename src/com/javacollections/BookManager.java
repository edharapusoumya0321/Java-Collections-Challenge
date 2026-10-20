package com.javacollections;

import java.util.ArrayList;
import java.util.Scanner;

public class BookManager {

    ArrayList<String> books = new ArrayList<>();

    public void manageBooks(Scanner sc) {
        int choice;

        do {
            System.out.println("\n--- Book Management ---");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Search Book");
            System.out.println("4. Remove Book");
            System.out.println("5. Back");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter book name: ");
                    String name = sc.nextLine();
                    books.add(name);
                    System.out.println("Book added successfully.");
                    break;

                case 2:
                    if (books.isEmpty()) {
                        System.out.println("No books available.");
                    } else {
                        System.out.println("Book List: " + books);
                    }
                    break;

                case 3:
                    System.out.print("Enter book name: ");
                    String search = sc.nextLine();

                    if (books.contains(search)) {
                        System.out.println("Book found.");
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter book name to remove: ");
                    String remove = sc.nextLine();

                    if (books.remove(remove)) {
                        System.out.println("Book removed successfully.");
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 5:
                    System.out.println("Returning to main menu.");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 5);
    }
}
