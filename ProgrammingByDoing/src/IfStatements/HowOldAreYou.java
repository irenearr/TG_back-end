package IfStatements;

import java.util.Scanner;

public class HowOldAreYou {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String firstname, lastname;
        int age;

        System.out.print("Hey, what's your first name? ");
        firstname = keyboard.next();
        System.out.print("And what's your last name " + firstname + "? ");
        lastname = keyboard.next();
        System.out.print("Ok " + firstname +" " + lastname + ", how old are you? ");
        age = keyboard.nextInt();

        if ( age < 16 )
        {
            System.out.println( "You can't drive " + firstname + ".");
        }

        if ( age < 18 )
        {
            System.out.println( "You can't vote " + firstname + "." );
        }

        if ( age < 25 )
        {
            System.out.println("You can't rent a car " + firstname + ".");
        }

        if ( age > 25 )
        {
            System.out.println("You can do anything that's legal " + firstname + ".");
        }

    }
}
//    Make a program which displays a different message depending on the age given. Here are the possible responses:
//        age is less than 16, say "You can't drive."
//        age is less than 18, say "You can't vote."
//        age is less than 25, say "You can't rent a car."
//        age is 25 or over, say "You can do anything that's legal."
//        Here's a sample run. Notice that a person who is under 16 will display three messages,
//        one for being under 16, one for also being under 18, and one for also being under 25.