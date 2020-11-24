package IfStatements;

import java.util.Scanner;

public class WorstNumberGuessingGameEver {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int guess, rightanswer;

        rightanswer = 4;

        System.out.println("TEH WORST NUBMER GESSING GAME EVAR!!!!!!!1!\n" +
                "\n" +
                "I\"M THKING OF A NBR FROM 1-10.  TRY 2 GESS! 3\n");
        guess = keyboard.nextInt();

        if (guess == rightanswer) {
            System.out.println("LOL!!! U GOT IT!  I CANT BELEIVE U GESSED IT WAS 4!");
        } else {
            System.out.println("W00T!  U SUX0R!!!  I PWN J00!!!  IT WAS 4!");
        }
    }
}
