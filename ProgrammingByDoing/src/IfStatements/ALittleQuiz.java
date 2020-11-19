package IfStatements;

import java.util.Scanner;

public class ALittleQuiz {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int answer1, answer2, answer3, result;

        result = 0;

        System.out.print("Are you ready for a quiz? ");
        keyboard.next();

        System.out.println("Ok, here it comes!\n" +
                        "Q1) What is the capital of Alaska?\n" +
                "\t1) Melbourne\n" +
                "\t2) Anchorage\n" +
                "\t3) Juneau" );
        answer1 = keyboard.nextInt();

        if (answer1 == 3) {
            System.out.println("That's right!");
            result ++;
        }
        else {
            System.out.println("Sorry, the correct answer is 3: Juneau.");
        }

        System.out.println("\nQ2) Can you store the value \"cat\" in a variable of type int?\n" +
                "\t1) yes\n" +
                "\t2) no");
        answer2 = keyboard.nextInt();

        if (answer2 == 2) {
            System.out.println("That's right!");
            result ++;
        }
        else {
            System.out.println("Sorry, \"cat\" is a string. ints can only store numbers.");
        }

        System.out.println("\nQ3) What is the result of 9+6/3?\n" +
                "\t1) 5\n" +
                "\t2) 11\n" +
                "\t3) 15/3");
        answer3 = keyboard.nextInt();
        if (answer3 == 2) {
            System.out.println("That's correct!");
            result ++;
        }
        else {
            System.out.println("Sorry, the correct answer is 2: 11.\n");
        }
        System.out.println( "\nOverall, you got " + result + " out of 3 correct.\n" +
                "Thanks for playing!");
    }
}
