package IfStatements;

public class WhatIf {
    public static void main( String[] args )
    {
        int people = 20;
        int cats = 20;
        int dogs = 15;

        if ( people < cats )
        {
            System.out.println( "Too many cats!  The world is doomed!" );
        }

        if ( people > cats )
        {
            System.out.println( "Not many cats!  The world is saved!" );
        }

        if ( people < dogs )
        {
            System.out.println( "The world is drooled on!" );
        }

        if ( people > dogs )
        {
            System.out.println( "The world is dry!" );
        }

        dogs += 5;

        if ( people >= dogs )
        {
            System.out.println( "People are greater than or equal to dogs." );
        }

        if ( people <= dogs )
        {
            System.out.println( "People are less than or equal to dogs." );
        }

        if ( people == dogs )
        {
            System.out.println( "People are dogs." );
        }
    }
}
// What do you think the if does to the code under it? Put your answer in a comment in the code.
//        The if compares if the statement is true or false
// What is the purpose of the curly braces in the if statement? Answer in a comment.
//        If the statement is true, the program runs the code in the curly braces.
// Change the values of the variables so that neither message about cats is printed.