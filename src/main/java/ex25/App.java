package ex25;

/*
 *  UCF COP3330 Fall 2021 Assignment 25 Solution
 *  Copyright 2021 Nathaniel Gibson
 */

import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = scanner.next();

        int strength = passwordValidator(password);
        switch(strength) {
            case 1:
                System.out.println("The password " + password + " is a very weak password");
                break;
            case 2:
                System.out.println("The password " + password + " is a weak password");
                break;
            case 3:
                System.out.println("The password " + password + " is a strong password");
                break;
            case 4:
                System.out.println("The password " + password + " is a very strong password");
                break;
            default:
                System.out.println("Invalid password");
                break;
        }
    }


    public static int passwordValidator(String password) {
        int strength = 0;
        //Check to see if it is only digits
        for(int i = 0; i < password.length(); i++) {
            if(Character.isDigit(password.charAt(i)) && password.length() <= 7) {
                strength = 1;
            } else {
                break;
            }
        }
        //Checks to see if only letters
        if(password.matches("[a-zA-Z]+") && password.length() <= 7) {
            strength = 2;
        }
        //Checks to see if letters and at least one number
        if(password.length() >= 8) {
            for(int i = 0; i < password.length()-1; i++) {
                if(Character.isDigit(password.charAt(i))) {
                    continue;
                } else if(Character.isLetter(password.charAt(i))) {
                    continue;
                } else if(!Character.isLetter(password.charAt(i)) && !Character.isDigit(password.charAt(i))){
                    break;
                }
            }
            strength = 3;
        }

        for(int i = 0; i < password.length(); i++) {
            if(Character.isDigit(password.charAt(i))) {
                continue;
            } else if(Character.isLetter(password.charAt(i))) {
                continue;
            }
        }

        //checks to see if letters, numbers, special characters, and at least eight characters
        if(password.length() >= 8) {
            for(int i = 0; i < password.length()-1; i++) {
                if(Character.isDigit(password.charAt(i))) {
                    continue;
                } else if(Character.isLetter(password.charAt(i))) {
                    continue;
                } else if (!Character.isDigit(password.charAt(i)) && !Character.isLetter(password.charAt(i))){
                    continue;
                }
            }
            strength = 4;
        }
        return strength;
    }
}
