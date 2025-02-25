package edu.eliandro.exceptionHandling;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TryCatch {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = sc.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = sc.nextLine();

        int age = 0;
        try {
            System.out.print("Enter your age: ");
            age = sc.nextInt();
        } catch (InputMismatchException err) {
            System.out.println("Field age needs to be with only numbers, try again!");
        }

        double higher = 0;
        try {
            System.out.print("Enter your higher: ");
            higher = sc.nextDouble();
        } catch (InputMismatchException err) {
            System.out.println("Field higher needs to be with only numbers and float point, try again!");
        }

        System.out.println("Person: " + firstName + " " + lastName + " age: " + age + " higher: " + higher);

        sc.close();
    }
}
