package Do_WhileLoops;

import java.util.Scanner;

public class SafeSquareRoot {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int x;

        System.out.print("SQUARE ROOT!\n" +
                "Enter a number: ");
        x = keyboard.nextInt();

        while (x < 0) {
            System.out.print("You can't take the square root of a negative number, silly.\n" +
                    "Try again: ");
            x = keyboard.nextInt();
        }
        System.out.println("The square root of " + x + " is " + Math.sqrt(x));
    }
}
