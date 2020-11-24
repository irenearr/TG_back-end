package WhileLoops;

import java.util.Random;
import java.util.Scanner;

public class KeepGuessing {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int guess, rightanswer;

        Random r = new Random();
        rightanswer = 1 + r.nextInt(10);;

        System.out.print("I have chosen a number between 1 and 10. Try to guess it.\n" +
                "Your guess: ");
        guess = keyboard.nextInt();

        while (guess != rightanswer) {
            System.out.println("That is incorrect. Guess again.");
            guess = keyboard.nextInt();
        }
            System.out.println("That's right! You're a good guesser.");
        }
    }
