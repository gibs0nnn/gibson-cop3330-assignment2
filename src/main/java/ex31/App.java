package ex31;

/*
 *  UCF COP3330 Fall 2021 Assignment 31 Solution
 *  Copyright 2021 Nathaniel Gibson
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Passes in user input for age and resting heart rate
        System.out.print("What is your resting pulse? ");
        String pulse = scanner.next();
        System.out.print("What is your age? ");
        String age = scanner.next();

        boolean ageTest = false;
        boolean pulseTest = false;

        //Checks input to make sure it is numerical
        for(int i = 0; i < pulse.length(); i++) {
            if(Character.isDigit(pulse.charAt(i))) {
                pulseTest = true;
            } else if(!Character.isDigit(pulse.charAt(i))){
                pulseTest = false;
                break;
            }
        }
        for(int i = 0; i < age.length(); i++) {
            if(Character.isDigit(age.charAt(i))) {
                ageTest = true;
            } else if(!Character.isDigit(age.charAt(i))){
                ageTest = false;
                break;
            }
        }
        if(!ageTest || !pulseTest) {
            System.out.println("Invalid input was provided");
            System.exit(0);
        }
        double ageDoub = Double.parseDouble(age);
        double pulseDoub = Double.parseDouble(pulse);

        //Displays output in a tabular format
        printTable(ageDoub, pulseDoub);
    }
    public static double getTargetRate(double age, double pulse, double intensity) {
        double target = (((220 - age) - pulse) * intensity) + pulse;
        return target;
    }
    public static void printTable(double age, double pulse) {
        System.out.println("************************************");
        System.out.println("Resting Pulse: " + (int) pulse + "        Age: " + (int) age);
        System.out.println("\nIntensity    | Rate\n-------------|--------");
        double intensity = 55;
        while(intensity <= 95) {

            System.out.println((int)intensity + "%          | " + Math.round(getTargetRate(age, pulse, (intensity / 100.0))) + " bpm");
            intensity += 5;
        }

    }
}
