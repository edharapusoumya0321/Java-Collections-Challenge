package com.javacollections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CustomerQueue {

    Queue<String> customers = new LinkedList<>();

    public void manageQueue(Scanner sc) {
        int choice;

        do {
            System.out.println("\n--- Customer Queue ---");
            System.out.println("1. Add Customer");
            System.out.println("2. Serve Customer");
            System.out.println("3. View Next Customer");
            System.out.println("4. Display All Customers");
            System.out.println("5. Back");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter customer name: ");
                    String name = sc.nextLine();

                    customers.offer(name);
                    System.out.println("Customer added successfully.");
                    break;

                case 2:
                    if (customers.isEmpty()) {
                        System.out.println("No customers in the queue.");
                    } else {
                        System.out.println("Serving: " + customers.poll());
                    }
                    break;

                case 3:
                    if (customers.isEmpty()) {
                        System.out.println("No customers waiting.");
                    } else {
                        System.out.println("Next customer: " + customers.peek());
                    }
                    break;

                case 4:
                    if (customers.isEmpty()) {
                        System.out.println("Queue is empty.");
                    } else {
                        System.out.println("Customers: " + customers);
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
