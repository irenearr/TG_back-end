package Do_WhileLoops;

import java.util.Scanner;

public class CollatzSequence {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int n, steps;

        steps = 0;

        System.out.print("Starting number: ");
        n = keyboard.nextInt();

        while (n > 1) {
            steps++;
            System.out.print(n + "   ");
            if ( n % 2 == 0 ) {
               n =  n / 2;
            }
            else {
                n = 3 * n + 1;
            }
        }
        System.out.println(n);
        System.out.println("Terminated after " + steps + " steps.");
    }
}
