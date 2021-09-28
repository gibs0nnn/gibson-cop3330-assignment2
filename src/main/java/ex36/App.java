package ex36;

/*
 *  UCF COP3330 Fall 2021 Assignment 36 Solution
 *  Copyright 2021 Nathaniel Gibson
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList numbers = new ArrayList();
        while (true) {
            System.out.print("Enter a number: ");
            String number = scanner.next();
            numbers.add(number);

            if(number.contentEquals("done")) {
                break;
            }
            for(int i = 0; i < numbers.size(); i++) {

            }

        }
        System.out.print("Numbers: ");
        for(int i = 0; i < numbers.size() - 1; i++) {
            System.out.print(numbers.get(i) + " ");
        }
    }
}



