//        Delete the 1 + in front of all six lines that pick numbers 1-5, so that they look like this:
//        System.out.print( r.nextInt(5) + " " ); Run the program a few times, and see if you can figure out
//        what range the new random numbers are in.
//              Without the 1+, you get a number between 0 and 4

//        Change the 1 + in front of all six lines that pick numbers 1-5, so that they look like this:
//        System.out.print( 3 + r.nextInt(5) + " " ); Run the program a few times. Is it picking random numbers
//        from 3 to 5? If not, what range are they?
//              Range is between 3 and 7, because by default it's 0 to 4, and then you add 3 so 0 + 3 = 3 and
//              4 + 3 = 7

//        Change the line where you create the random number generator so that it looks like this:
//        Random r = new Random(12353); This number is called a seed. Run the program a few times.
//        What do you notice? What happened to the random numbers?
//              They are the same every time

//        Change to random seed to something else and observe the behavior. What happens to the random numbers?
//        (Delete the random seed before turning in the assignment.)
//              The random numbers change, but they are the same every run.

package RandomNumbers;

import java.util.Random;

public class Randomness {
    public static void main(String[] args) {

        Random r = new Random();

        int x = 1 + r.nextInt(10);

        System.out.println( "My random number is " + x );

        System.out.println( "Here are some numbers from 1 to 5!" );
        System.out.print( 1 + r.nextInt(5) + " " );
        System.out.print( 1 + r.nextInt(5) + " " );
        System.out.print( 1 + r.nextInt(5) + " " );
        System.out.print( 1 + r.nextInt(5) + " " );
        System.out.print( 1 + r.nextInt(5) + " " );
        System.out.print( 1 + r.nextInt(5) + " " );
        System.out.println();

        System.out.println( "Here are some numbers from 1 to 100!" );
        System.out.print( 1 + r.nextInt(100) + "\t" );
        System.out.print( 1 + r.nextInt(100) + "\t" );
        System.out.print( 1 + r.nextInt(100) + "\t" );
        System.out.print( 1 + r.nextInt(100) + "\t" );
        System.out.print( 1 + r.nextInt(100) + "\t" );
        System.out.print( 1 + r.nextInt(100) + "\t" );
        System.out.println();

        int num1 = 1 + r.nextInt(10);
        int num2 = 1 + r.nextInt(10);

        System.out.println("The first random number is " + num1 + " and the second random number is " + num2 + ".");

        if ( num1 == num2 )
        {
            System.out.println( "The random numbers were the same! Weird." );
        }
        if ( num1 != num2 )
        {
            System.out.println( "The random numbers were different! Not too surprising, actually." );
        }

    }
}
