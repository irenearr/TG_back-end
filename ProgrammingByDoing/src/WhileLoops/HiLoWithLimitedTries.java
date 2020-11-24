package WhileLoops;

import java.util.Random;
import java.util.Scanner;

public class HiLoWithLimitedTries {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();

        int randomnumber = 1 + r.nextInt(100);
        int guess;

        System.out.print("I'm thinking of a number between 1-100.  You have 7 guesses. First guess: ");
        guess = keyboard.nextInt();

        int n = 0;
        while (n < 7 && guess != randomnumber) {
            if (guess < randomnumber) {
                System.out.println("Sorry, you are too low.");
            }
            if (guess > randomnumber) {
                System.out.println("Sorry, that guess is too high.");
            }
            System.out.print("Guess #" + (n+2) + ": ");
            guess = keyboard.nextInt();
            n++;
        }
        if (guess == randomnumber) {
            System.out.println("You guessed it!  What are the odds?!?");
    }
        else {
            System.out.println("Sorry, you didn't guess it in 7 tries.  You lose.");
        }
}}
