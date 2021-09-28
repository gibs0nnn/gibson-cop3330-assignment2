package ex29;

/*
 *  UCF COP3330 Fall 2021 Assignment 29 Solution
 *  Copyright 2021 Nathaniel Gibson
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean instance = true;

        while(instance) {
            System.out.print("What is the rate of return? ");
            String value = scanner.next();

            //Displays output based on input value type
            if(checkReturn(value)) {
                System.out.println("Sorry. That is not a valid input.");
            } else {
                instance = false;
                double doubleValue = Double.parseDouble(value);
                double years = 72.0 / doubleValue;
                System.out.println("It will take " + (int) years + " years to double your initial investment.");
            }
        }
    }
    //Checks if the input meets requirements
    public static boolean checkReturn(String value) {
        for(int i = 0; i < value.length(); i++) {
            if(value.contentEquals("0")) {
                return true;
            }
            if(!Character.isDigit(value.charAt(i))){
                return true;
            }
        }
        return false;
    }
}
