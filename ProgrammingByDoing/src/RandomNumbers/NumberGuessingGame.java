package RandomNumbers;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int guess, rightanswer;

        Random r = new Random();
        rightanswer = 1 + r.nextInt(10);;

        System.out.print("A slightly better number guessing game!!\n" +
                "I\"m thinking of a number from 1-10.\n  Your guess: ");
        guess = keyboard.nextInt();

        if (guess == rightanswer) {
            System.out.println("That's right!  My secret number was " + rightanswer + "!");
        } else {
            System.out.println("Sorry, but I was really thinking of " + rightanswer + ".");
        }
    }
}
