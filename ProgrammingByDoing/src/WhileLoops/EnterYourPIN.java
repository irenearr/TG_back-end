//        How is a while loop similar to an if statement?
//          It compares an input to a rule between brackets and checks if it's true or false. If it's true
//          a certain behavior is activated.
//        How is a while loop different from an if statement?
//          the differences are that if the statement in a while loop is true, it keeps looping i.e. it starts from
//          the top again, and also that there's no "else", once the statement in the while loop is false, the next
//          lines of code are read.
//        Inside the while loop, why isn't there an int in front of the line entry = keyboard.nextInt()?
//          Because the variable entry is already declared before the while loop?
//        Delete the line entry = keyboard.nextInt(); from inside the while loop. What happens? Why?
//          The loop goes on and on, printing "Enter your pin: Incorrect pin. try again." over and over!
//          This is because it keeps using the first entry which was incorrect, so the while loop stays true.
//        (Put the entry = keyboard.nextInt(); back before you turn in the assignment.)

package WhileLoops;

import java.util.Scanner;

public class EnterYourPIN {
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);
        int pin = 12345;

        System.out.println("WELCOME TO THE BANK OF MITCHELL.");
        System.out.print("ENTER YOUR PIN: ");
        int entry = keyboard.nextInt();

        while ( entry != pin )
        {
            System.out.println("\nINCORRECT PIN. TRY AGAIN.");
            System.out.print("ENTER YOUR PIN: ");
            entry = keyboard.nextInt();
        }

        System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
    }
}