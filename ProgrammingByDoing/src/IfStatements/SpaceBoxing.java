package IfStatements;

import java.util.Scanner;

public class SpaceBoxing {
    public static void main( String[] args ) {

        Scanner keyboard = new Scanner(System.in);

        double weight, local_weight;
        int planet;

        local_weight = 0.0;

        System.out.println("Please enter your current earth weight: ");
        weight = keyboard.nextDouble();

        System.out.println("I have information for the following planets:\n" +
                "   1. Venus   2. Mars    3. Jupiter\n" +
                "   4. Saturn  5. Uranus  6. Neptune\n" +
                "Which planet are you visiting?");
        planet = keyboard.nextInt();

        if ( planet == 1 )
        {
            local_weight = Math.round((weight * 0.78)*100.0)/100.0;
        }
        else if ( planet == 2 )
        {
            local_weight = Math.round((weight * 0.39)*100.0)/100.0;
        }
        else if ( planet == 3 )
        {
            local_weight = Math.round((weight * 2.65)*100.0)/100.0;
        }
        else if ( planet == 4 )
        {
            local_weight = Math.round((weight * 1.17)*100.0)/100.0;
        }
        else if ( planet == 5 )
        {
            local_weight = Math.round((weight * 1.05)*100.0)/100.0;
        }
        else if ( planet == 6 )
        {
            local_weight = Math.round((weight * 1.23)*100.0)/100.0;
        }
        else
            System.out.println("Error: invalid planet.");

        System.out.println("Your weight would be " + local_weight + " on that planet.");
    }
}
