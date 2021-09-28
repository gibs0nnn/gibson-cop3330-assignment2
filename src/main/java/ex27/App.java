package ex27;

import java.util.Scanner;

//STARTED BUT NOT DONE

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Input
        System.out.print("Enter the first name: ");
        String firstName = scanner.next();
        System.out.print("Enter the last name: ");
        String lastName = scanner.next();
        System.out.print("Enter the ZIP code: ");
        String zip = scanner.next();
        System.out.print("Enter the employee ID: ");
        String id = scanner.next();

        validateInput(firstName, lastName, zip, id);

    }
    public static void checkFirst(String first) {
        if(first == null) {
            System.out.println("The first name must be filled in");
        } else if(first.length()-1 < 2) {
            System.out.println("The first name must be at least two characters long");
        }
    }
    public static void checkSecond(String second) {
        if(second == null) {
            System.out.println("The last name must be filled in");
        } else if(second.length()-1 < 2) {
            System.out.println("The last name must be at least 2 characters long.");
        }
    }
    public static void employeeID(String id) {

    }
    public static void checkZip(String zip) {
        if(zip.length() != 5) {
            System.out.println("The zip code must be a 5 digit number");
        }
        for(int i = 0; i < zip.length(); i++) {
            if(Character.isDigit(zip.charAt(i))) {
                continue;
            } else if(!Character.isDigit(zip.charAt(i))){
                System.out.println("The zip code must all be digits");
            }
        }
    }
    public static void validateInput(String first, String second, String id, String zip) {
        checkFirst(first);
        checkSecond(second);
        employeeID(id);
        checkZip(zip);
    }
}

