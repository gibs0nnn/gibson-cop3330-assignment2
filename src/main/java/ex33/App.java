package ex33;

/*
 *  UCF COP3330 Fall 2021 Assignment 33 Solution
 *  Copyright 2021 Nathaniel Gibson
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] eightBall = new String[] {"Yes", "No", "Maybe", "Ask Again Later"};
        int answer = (int) (Math.random() * 4);
        System.out.println("What's your question?");
        String userQuestion = scanner.next();
        System.out.println("\n" + eightBall[answer]);
    }
}
