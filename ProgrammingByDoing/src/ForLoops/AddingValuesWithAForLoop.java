package ForLoops;

import java.util.Scanner;

public class AddingValuesWithAForLoop {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Give me a number! ");
        int x = keyboard.nextInt();
        int y = 0;

        for (int i = 1 ; i <= x ; i = i+1)
        {
            System.out.print(i + "    ");
            y = y + i;
        }
        System.out.println("\nThe sum is " + y);
    }
}
