package ex32;

/*
 *  UCF COP3330 Fall 2021 Assignment 32 Solution
 *  Copyright 2021 Nathaniel Gibson
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        menu();
    }

    //Lods initial menu and allows for repeated game sessions
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lets play Guess the Number!\n");
        System.out.print("Enter the difficulty level (1, 2, or 3): ");
        String stringDifficulty = scanner.next();
        if(checkInput(stringDifficulty)) {
            int difficulty = Integer.parseInt(stringDifficulty);
            game(difficulty);
        } else {
            System.out.println("Invalid Input");
        }
    }

    //Controls the game and potential user inputs
    public static void game(int difficulty) {
        int counter = 0;
        int numbers = 0;

        Scanner scanner = new Scanner(System.in);
        switch(difficulty) {
            case 1:
                numbers = 10;
                break;
            case 2:
                numbers = 100;
                break;
            case 3:
                numbers = 1000;
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
        int computerNumber = (int) (Math.random() * numbers);
        System.out.println(computerNumber);
        System.out.print("I have my number. What's your guess? ");
        for(int i = 0; i < numbers; i++) {
            String guess = scanner.next();
            if(checkInput(guess)) {
                int myGuess = Integer.parseInt(guess);
                if(myGuess > computerNumber) {
                    System.out.print("Too High. Guess Again: ");
                } else if(myGuess < computerNumber) {
                    System.out.print("Too Low. Guess Again: ");
                } else {
                    System.out.println("You got it in " + counter + " guesses!");
                    System.out.println("Do you wish to play again (Y/N): ");
                    String play = scanner.next();
                    if(play.contentEquals("y") || play.contentEquals("Y")) {
                        menu();
                    } else {
                        System.out.println("Thanks for playing!");
                        System.exit(0);
                    }
                }
                counter++;
            }
        }
    }
    //Ensures inputs are given as only integers
    public static boolean checkInput(String input) {
        for(int i = 0; i < input.length(); i++) {
            if(!Character.isDigit(input.charAt(i))) {
                return false;
            } else {
                continue;
            }
        }
        return true;
    }
}
