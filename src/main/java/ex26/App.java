package ex26;

/*
 *  UCF COP3330 Fall 2021 Assignment 26 Solution
 *  Copyright 2021 Nathaniel Gibson
 */
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Input
        System.out.print("What is the balance: ");
        int balance = scanner.nextInt();
        System.out.print("What is the APR on your card (as a percent)? ");
        int dailyRate = scanner.nextInt();
        dailyRate /= 365;
        System.out.print("What is the monthly payment you can make? ");
        int payment = scanner.nextInt();

        //Output
        System.out.println("It will take you " + PaymentCalculator.calculateMonthsUntilPaidOff(payment, dailyRate, balance)
         + " months to pay off this card");
    }
}
