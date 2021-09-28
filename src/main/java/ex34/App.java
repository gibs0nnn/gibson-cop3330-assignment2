package ex34;

/*
 *  UCF COP3330 Fall 2021 Assignment 34 Solution
 *  Copyright 2021 Nathaniel Gibson
 */

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList employees = new ArrayList();
        employees.add("Tucker Carlson");
        employees.add("Donald Trump");
        employees.add("Nate Gibson");
        employees.add("Bernie Sanders");
        employees.add("Julian Assange");

        System.out.println("There are " + employees.size() + " employees: ");

        for(int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i));
        }
        System.out.print("\nEnter an employee name to remove: ");
        String remove = scanner.nextLine();
        employees.remove(new String(remove));

        System.out.println("\nThere are " + employees.size() + " employees");
        for(int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i));
        }
    }
}
