package IfStatements;

import java.util.Scanner;

public class GenderGame {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String gender, firstname, lastname, married;
        int age;

        married = "";

        System.out.println("What is your gender? (M / F)");
        gender = keyboard.next();
        System.out.println("First name: ");
        firstname = keyboard.next();
        System.out.println("Last name: ");
        lastname = keyboard.next();
        System.out.println("Age: ");
        age = keyboard.nextInt();

        if (age > 20 && gender.equals("F")) {
            System.out.println("Are you married? (Y / N)");
        married = keyboard.next();
        }
        if (age > 20 && gender.equals("F") && married.equals("Y")) {
            System.out.println("Have nice day Mrs. " + lastname + ".");
        }
        if (age > 20 && gender.equals("F") && married.equals("N")) {
            System.out.println("Have a nice day Ms. " + lastname +".");
        }
        if (age < 20 ) {
            System.out.println("Have a nice day " + firstname + " " + lastname + ".");
        }
        if (age > 20 && gender.equals("M")) {
            System.out.println("Have a nice day Mr. " + lastname + ".");
        }
    }
}
