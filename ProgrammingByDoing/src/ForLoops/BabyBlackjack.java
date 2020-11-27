package ForLoops;

import java.util.Random;
import java.util.Scanner;

public class BabyBlackjack {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();

        int playercard1 = 1 + r.nextInt(10);
        int playercard2 = 1 + r.nextInt(10);
        int dealercard1 = 1 + r.nextInt(10);
        int dealercard2 = 1 + r.nextInt(10);

        System.out.println("Baby Blackjack!\nYou drew: " + playercard1 + " and " + playercard2 + ". \nYour total is " + (playercard1 + playercard2) + ".\n" +
        "\nThe dealer drew: " + dealercard1 + " and " + dealercard2 + ". \nDealer's total is " + (dealercard1+dealercard2) + ".");
        if ((playercard1+playercard2) > (dealercard1+dealercard2)) {
            System.out.println("YOU WIN!");
        }
        else System.out.println("YOU LOSE!");
    }
}
