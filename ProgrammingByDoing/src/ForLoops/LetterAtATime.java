// Assignments:
// 1. The for loop is defined so that it repeats as long as i < message.length(). Try changing it to <=.
//    What happens? Answer in a comment, then change it back.
//          It works, but you get an error message at the end: Exception in thread "main" java.lang.
//          StringIndexOutOfBoundsException: String index out of range: 13
//          This is because i starts at 0, while the message length starts counting at 1.
// 2. If a string variable contains the value "box", what is its length()? What is the position of the last
//    character (the 'x')?
//          3 characters, position of x is 2.
// 3. So, why does the for loop repeat as long as i < message.length() instead of i <= message.length()?
//          because index starts counting at 0, while the message length starts at 1.
// 4. Currently the code prints out the number of 'a's in the message. Change it so that it prints out the
//    number of vowels (a A e E i I o O u U).

package ForLoops;

import java.util.Scanner;

public class LetterAtATime
{
    public static void main( String[] args )
    {
        Scanner kb = new Scanner(System.in);

        System.out.print("What is your message? ");
        String message = kb.nextLine();

        System.out.println("\nYour message is " + message.length() + " characters long.");
        System.out.println("The first character is at position 0 and is '" + message.charAt(0) + "'.");
        int lastpos = message.length() - 1;
        System.out.println("The last character is at position " + lastpos + " and is '" + message.charAt(lastpos) + "'.");
        System.out.println("\nHere are all the characters, one at a time:\n");

        for ( int i=0; i< message.length(); i++ )
        {
            System.out.println("\t" + i + " - '" + message.charAt(i) + "'");
        }

        int vowels = 0;

        for ( int i=0; i<message.length(); i++ )
        {
            char letter = message.charAt(i);
            if ( letter == 'a' || letter == 'A' || letter == 'e' || letter == 'E' || letter == 'o' || letter == 'O' || letter == 'i' || letter == 'I' || letter == 'u' || letter == 'U')
            {
                vowels++;
            }
        }
        System.out.println("\nYour message contains " + vowels + " vowels. Isn't that interesting?");
    }
}