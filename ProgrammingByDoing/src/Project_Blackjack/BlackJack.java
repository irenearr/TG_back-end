package Project_Blackjack;

import java.util.Random;
import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();

        int playercard1 = 2 + r.nextInt(10);
        int playercard2 = 2 + r.nextInt(10);
        int playertotal = playercard1+playercard2;
        int dealercard1 = 2 + r.nextInt(10);
        int dealercard2 = 2 + r.nextInt(10);
        int dealertotal = dealercard1+dealercard2;

        String hitorstay;

        System.out.println("Welcome to Mitchell's blackjack program!\n" +
                "You get a: " + playercard1 + " and a " + playercard2 + ". \n" +
                "Your total is " + playertotal + ".\nThe dealer has " +
                "a " + dealercard1 + " showing, " +
                "and a hidden card. His total is hidden, too.\n" +
                "Would you like to \"hit\" or \"stay\"?");
        hitorstay = keyboard.next();

        if (hitorstay.equals("hit") || hitorstay.equals("Hit"))
        {
            int playercard3 = 2 + r.nextInt(10);
            playertotal = playertotal + playercard3;
            System.out.println("You drew a " + playercard3 + ". Your total is " +
                    playertotal + ".");

            while (playertotal <= 21)
            {
                if (playertotal > 21)
                {
                    System.out.println("Your total is over 21. You Lose..");
                    break;
                }
                System.out.println("Would you like to \"hit\" or \"stay\"?");
                hitorstay = keyboard.next();
                if (hitorstay.equals("hit") || hitorstay.equals("Hit"))
                {
                    int playercard4 = 2 + r.nextInt(10);
                    playertotal = playertotal + playercard4;
                    System.out.println("You drew a " + playercard4 + ". Your total is " +
                            playertotal + ".");
            }
            if (playertotal > 21)
            {
                System.out.println("Your total is over 21. You Lose..");
                break;
            }
                if (hitorstay.equals("stay") || hitorstay.equals("Stay"))
                {
                    System.out.println("Okay, dealer's turn.\n" +
                            "His hidden card was a " + dealercard2 + ".\n" +
                            "His total was " + dealertotal + ".\n");
                while (dealertotal <=16)
                {
                    int dealercard3 = 2 + r.nextInt(10);
                    dealertotal = dealertotal + dealercard3;
                    System.out.println("Dealer chooses to hit. He draws a " + dealercard3 + ". His total is " + dealertotal + ".");
                }
                if (dealertotal > 21)
                {
                    System.out.println("Dealer's total is over 21. You Win!");
                    break;
                }
                else if (playertotal > dealertotal ){
                    System.out.println("You win!!!");
                    break;
                }
                else if (playertotal <= dealertotal) {
                    System.out.println("You lose...");
                    break;
                }
                else System.out.println("Something went wrong.");
                }}}
        else if (hitorstay.equals("stay") || hitorstay.equals("Stay"))
        {
            System.out.println("Okay, dealer's turn.\n" +
                    "His hidden card was a " + dealercard2 + ".\n" +
                    "His total was " + dealertotal + ".\n");
        }
        while (dealertotal <=16)
        {
            int dealercard3 = 2 + r.nextInt(10);
            dealertotal = dealertotal + dealercard3;
            System.out.println("Dealer chooses to hit. He draws a " + dealercard3 + ". His total is " + dealertotal + ".");
        }
            if (dealertotal > 21)
            {
                System.out.println("Dealer's total is over 21. You Win!");
            }
            else if (playertotal > dealertotal ){
                System.out.println("You win!!!");
            }
            else if (playertotal <= dealertotal) {
                System.out.println("You lose...");
            }
            else System.out.println("Something went wrong.");
}}
