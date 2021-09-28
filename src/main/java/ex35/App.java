package ex35;

/*
 *  UCF COP3330 Fall 2021 Assignment 35 Solution
 *  Copyright 2021 Nathaniel Gibson
 */

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList nameList = new ArrayList();

        while(true) {
            System.out.print("Enter a name: ");
            String name = scanner.nextLine();
            if(name.equals("")) break;
            nameList.add(name);
        }

        int winner = (int) (Math.random() * nameList.size());
        System.out.println("The winner is... " + nameList.get(winner));

    }
}
