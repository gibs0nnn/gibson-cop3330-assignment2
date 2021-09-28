package ex28;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;

        //Collect Input
        for(int i = 0; i < 5; i++) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            total += number;
        }

        //Display output
        System.out.println("The total is " + total);
    }
}
