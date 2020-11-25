// Assignments:
// 1. Run the program, and type in 80.5 for the current water temperature.
//    Do Goofus and Gallant swim for the same amount of time? Put your answer in a comment.
//          Yes, both swim for 4 minutes.
// 2. Run the program again, but this time enter 78 for the starting temperature. What changes?
//          Gallant doesn't even swim (0 minutes), Goofus swims for 1 minute.
// 3. Does Gallant check the water temperature first, or does he just dive right in?
//          It seems like Gallant checks the water temperature, because at 78 degr F, he doesn't start swimming.
// 4. What about Goofus? Does he check the water temperature first or just dive in?
//          It seems Goofus dives right in.
// 5. What is the difference between a while loop and a "do-while" loop?
//          In a do-while loop the program runs what's under do, and then checks if while is true, to see if
//          it should keep going through the loop. A while loop first checks if while is true, otherwise
//          it doesn't even start to run the piece of code.
// 6. One of these loops is sometimes called a "pre-test loop", and the other is called a "post-test loop".
//    Which one is which?
//          I would call the while-loop a pre-test loop, and the do-while loop a post-test loop.

package Do_WhileLoops;

import java.util.Scanner;

public class Do_WhileSwimming {
    public static void main( String[] args ) throws Exception
    {
        Scanner keyboard = new Scanner(System.in);

        String swimmer1 = "GALLANT";
        String swimmer2 = "GOOFUS ";

        double minimumTemperature = 79.0; // degrees Fahrenheit
        double currentTemperature;
        double savedTemperature;
        int swimTime;

        System.out.print("What is the current water temperature? ");
        currentTemperature = keyboard.nextDouble();
        savedTemperature = currentTemperature; // saves a copy of this value so we can get it back later.

        System.out.println( "\nOkay, so the current water temperature is " + currentTemperature + "F." );
        System.out.println( swimmer1 + " approaches the lake...." );

        swimTime = 0;
        while ( currentTemperature >= minimumTemperature )
        {
            System.out.print( "\t" + swimmer1 + " swims for a bit." );
            swimTime++;
            System.out.println( " Swim time: " + swimTime + " min." );
            Thread.sleep(600); // pauses for 600 milliseconds
            currentTemperature -= 0.5; // subtracts 1/2 a degree from the water temperature
            System.out.println( "\tThe current water temperature is now " + currentTemperature + "F." );
        }

        System.out.println( swimmer1 + " stops swimming. Total swim time: " + swimTime + " min." );

        currentTemperature = savedTemperature; // restores original water temperature

        System.out.println( "\nOkay, so the current water temperature is " + currentTemperature + "F." );
        System.out.println( swimmer2 + " approaches the lake...." );

        swimTime = 0;
        do
        {
            System.out.print( "\t" + swimmer2 + " swims for a bit." );
            swimTime++;
            System.out.println( " Swim time: " + swimTime + " min." );
            Thread.sleep(600);
            currentTemperature -= 0.5;
            System.out.println( "\tThe current water temperature is now " + currentTemperature + "F." );

        } while ( currentTemperature >= minimumTemperature );

        System.out.println( swimmer2 + " stops swimming. Total swim time: " + swimTime + " min." );
    }
}
