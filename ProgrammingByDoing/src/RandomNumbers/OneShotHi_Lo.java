package RandomNumbers;

import java.util.Random;
import java.util.Scanner;

public class OneShotHi_Lo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();

        int randomnumber = 1 + r.nextInt(100);
        int guess;

        System.out.println("I'm thinking of a number between 1-100.  Try to guess it.");
        guess = keyboard.nextInt();

        if (guess == randomnumber) {
            System.out.println("You guessed it!  What are the odds?!?");
        }
        else if (guess > randomnumber) {
            System.out.println("Sorry, you are too high.  I was thinking of " + randomnumber + ".");
        }
        else if (guess < randomnumber) {
            System.out.println("Sorry, you are too low.  I was thinking of " + randomnumber + ".");
        }
    }
}
