package com.javacollections;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BookManager bookManager = new BookManager();
        StudentManager studentManager = new StudentManager();
        CustomerQueue customerQueue = new CustomerQueue();

        int choice;

        do {
            System.out.println("\n===== Java Collections Challenge =====");
            System.out.println("1. Book Management (ArrayList)");
            System.out.println("2. Student Management (HashMap)");
            System.out.println("3. Customer Queue (Queue)");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    bookManager.manageBooks(sc);
                    break;

                case 2:
                    studentManager.manageStudents(sc);
                    break;

                case 3:
                    customerQueue.manageQueue(sc);
                    break;

                case 4:
                    System.out.println("Application closed.");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}
