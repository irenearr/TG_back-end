// Assignments
// 1.Change the code so that it locks them out after 4 tries instead of 3. Make sure to change the message
//   at the bottom, too.
// 2.Move the "maximum tries" value into a variable, and use that variable everywhere instead of just the number.

package WhileLoops;

import java.util.Scanner;

public class PinLockOut
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);
        int pin = 12345;
        int tries = 0;
        int maxtries = 4;

        System.out.println("WELCOME TO THE BANK OF MITCHELL.");
        System.out.print("ENTER YOUR PIN: ");
        int entry = keyboard.nextInt();
        tries++;

        while ( entry != pin && tries < maxtries )
        {
            System.out.println("\nINCORRECT PIN. TRY AGAIN.");
            System.out.print("ENTER YOUR PIN: ");
            entry = keyboard.nextInt();
            tries++;
        }

        if ( entry == pin )
            System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
        else if ( tries >= maxtries )
            System.out.println("\nYOU HAVE RUN OUT OF TRIES. ACCOUNT LOCKED.");
    }
}
