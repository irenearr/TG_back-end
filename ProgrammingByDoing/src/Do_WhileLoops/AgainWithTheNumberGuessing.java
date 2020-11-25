package Do_WhileLoops;

import java.util.Random;
import java.util.Scanner;

public class AgainWithTheNumberGuessing {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int guess, rightanswer;
        int n = 0;

        Random r = new Random();
        rightanswer = 1 + r.nextInt(10);;

        System.out.print("I have chosen a number between 1 and 10. Try to guess it.\nYour guess: ");
        guess = keyboard.nextInt();

        if (guess == rightanswer) {
            System.out.println("That's right! You're an amazing guesser. You've guessed it right at the first try!!");
        }
        else {
        do {
            System.out.println("That is incorrect. Guess again.");
            System.out.print("Your guess: ");
            guess = keyboard.nextInt();
            n++;
        }

        while (guess != rightanswer);

        System.out.println("That's right! You're a good guesser. It only took you " + (n+1) + " tries.");
    }}
}
