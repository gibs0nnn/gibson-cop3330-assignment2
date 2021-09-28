package ex24;

/*
 *  UCF COP3330 Fall 2021 Assignment 24 Solution
 *  Copyright 2021 Nathaniel Gibson
 */


import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first string: ");
        String str1 = scanner.next();
        System.out.print("Enter your second string: ");
        String str2 = scanner.next();

        if(isAnagram( str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams");
        }

    }//main
    static boolean isAnagram( String str1, String str2) {
        if(str1.length() != str2.length() ) return false;

        ArrayList<Integer> idxList = new ArrayList<Integer>();

        for(int i = 0; i < str1.length();i++) {

            String myChar = str1.substring(i, i + 1);
            int charIdx = str2.indexOf(myChar);
            if( charIdx == -1 ) return false;

            if( !idxList.contains(charIdx) ) {
                idxList.add(charIdx);
            } else {
                charIdx = str2.indexOf( myChar, idxList.indexOf(charIdx));
                if( charIdx == -1 ) return false;
            }

        }

        return true;
    }




}

