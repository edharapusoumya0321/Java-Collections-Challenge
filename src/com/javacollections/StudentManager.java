package com.javacollections;

import java.util.HashMap;
import java.util.Scanner;

public class StudentManager {

    HashMap<Integer, String> students = new HashMap<>();

    public void manageStudents(Scanner sc) {
        int choice;

        do {
            System.out.println("\n--- Student Management ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Back");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter student name: ");
                    String name = sc.nextLine();

                    students.put(id, name);
                    System.out.println("Student added successfully.");
                    break;

                case 2:
                    if (students.isEmpty()) {
                        System.out.println("No students available.");
                    } else {
                        System.out.println("Student Details: " + students);
                    }
                    break;

                case 3:
                    System.out.print("Enter student ID: ");
                    int searchId = sc.nextInt();

                    if (students.containsKey(searchId)) {
                        System.out.println(
                            "Student Name: " + students.get(searchId));
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    System.out.println("Returning to main menu.");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 4);
    }
}
