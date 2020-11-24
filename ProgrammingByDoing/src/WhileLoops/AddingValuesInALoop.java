package WhileLoops;

import java.util.Scanner;

public class AddingValuesInALoop {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("I will add up the numbers you give me, until you type 0.\n" +
                "Number: ");
        int number = keyboard.nextInt();
        int sum = 0;
        int oldnumber = 0;

        while (number != 0) {
            sum = oldnumber + number;
            System.out.print("The total so far is " + sum + "\nNumber: ");
            oldnumber = sum;
            number = keyboard.nextInt();
        }
        System.out.println("Total is " + sum);
    }
}
