package RandomNumbers;

import java.util.Random;
import java.util.Scanner;

public class ThreeCardMonte {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();
        int ace = 1 + r.nextInt(3);
        int guess;

        System.out.println("You slide up to Fast Eddie's card table and plop down your cash.\n" +
                "He glances at you out of the corner of his eye and starts shuffling.\n" +
                "He lays down three cards.\n" +
                "\n" +
                "Which one is the ace?\n" +
                "\n" +
                "\t##  ##  ##\n" +
                "\t##  ##  ##\n" +
                "\t1   2   3\n");
        guess = keyboard.nextInt();

        if (guess == ace) {
            System.out.println(
                    "You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.");
        }
        else {
            System.out.println("\nHa! Fast Eddie wins again! The ace was card number " + ace + ".");
        }
        if (ace == 1) {
            System.out.println(
                    "\tAA  ##  ##\n" +
                    "\tAA  ##  ##\n" +
                    "\t1   2   3");
        }
        if (ace == 2) {
            System.out.println("\n" +
                    "\t##  AA  ##\n" +
                    "\t##  AA  ##\n" +
                    "\t1   2   3");
        }
        if (ace == 3) {
            System.out.println("\n" +
                    "\t##  ##  AA\n" +
                    "\t##  ##  AA\n" +
                    "\t1   2   3");
        }
    }
}
