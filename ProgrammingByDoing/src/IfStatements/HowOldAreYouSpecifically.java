package IfStatements;

import java.util.Scanner;

public class HowOldAreYouSpecifically {
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

        else if ( age < 18 )
        {
            System.out.println( "You can drive but not vote " + firstname + "." );
        }

        else if ( age < 25 )
        {
            System.out.println("You can vote but not rent a car " + firstname + ".");
        }

       else
        {
            System.out.println("You can do pretty much anything " + firstname + ".");
        }

    }
}
