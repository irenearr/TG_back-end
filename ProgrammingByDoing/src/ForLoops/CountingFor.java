//For loops are best when we know in advance how many times we want to do something.
//
//        Do this ten times.
//        Do this five times.
//        Pick a random number, and do it that many times.
//        Take this list of items, and do it one time for each item in the list.
//        On the other hand, while loops are best for repeating as long as something is true:
//
//        Keep going as long as they haven't guessed it.
//        Keep going as long as you haven't got doubles.
//        Keep going as long as they keep typing in a negative number.
//        Keep going as long as they haven't typed in a zero.

// Assignments:
// 1. What does n = n+1 do? Remove it and see what happens. (Then put it back.)
//        The loop goes on forever, because n never reaches 5.
// 2. What does int n = 1 do? Remove it and see what happens. (Then put it back.)
//        It declares n, and sets it to 1, without it the code doesn't run.
// 3. Change the code so that the loop repeats ten times instead of five.
// 4. See if you can change the for loop so that the message starts at 2 and counts by twos.

package ForLoops;

import java.util.Scanner;

public class CountingFor
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println( "Type in a message, and I'll display it five times." );
        System.out.print( "Message: " );
        String message = keyboard.nextLine();

        for ( int n = 2 ; n <= 20 ; n = n+2 )
        {
            System.out.println( n + ". " + message );
        }

    }
}