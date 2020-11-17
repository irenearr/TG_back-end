package Basics;
//        + plus
//        - minus
//        / slash
//        * asterisk
//        % percent
//        < less-than
//        > greater-than
//        <= less-than-or-equal
//        >= greater-than-or-equal

//        Notice the math seems "wrong"? There are no fractions, only whole numbers.
//        Find out why by researching what a "floating point" number is.
//        Rewrite NumbersAndMath.java to use floating point numbers so it's more accurate
//        (hint: 20.0 is floating point).
//        Solution: write the first number in the calculation (or at least, the first number that is being
//        calculated, in this case the number after the /, as a decimal number, and all of them will be
//        seen as decimals.

public class NumbersAndMath {
    public static void main( String[] args)
    {
        // prints text
        System.out.println( "I will now count my chickens:" );
        // prints text followed by a calculation, 25 + 5
        System.out.println( "Hens " + ( 25 + 30 / 6.0 ) );
        // prints text followed by a calculation, 100 - 25 * 0,12 = 100 - 3
        System.out.println( "Roosters " + ( 100 - 25 * 3.0 % 4.0 ) );
        // prints text
        System.out.println( "Now I will count the eggs:" );
        // 5 + 1 - 5 + 0.08 - 0.25 + 6 = 1 + 0.08 - 0.25 + 6 = 7.33 WRONG: answer is 6.75
        System.out.println(3 + 2 + 1 - 5 + 4 % 2 - 1 / 4.0 + 6);
        System.out.println(3 + 2 + 1 - 5 + 4 % 2 - 1 / (double)4 + 6);
        // prints text
        System.out.println( "Is it true that 3 + 2 < 5 - 7?" );
        // tells you if a statement is true or false, in this case: 5 is smaller than -2
        System.out.println( 3 + 2 < 5 - 7 );
        // prints a calculation and the answer
        System.out.println( "What is 3 + 2? " + ( 3 + 2 ) );
        // prints a calculation and the answer
        System.out.println( "What is 5 - 7? " + ( 5 - 7 ) );
        // prints text
        System.out.println( "Oh, that's why it's false." );
        // prints text
        System.out.println( "How about some more." );
        // prints text and tells you if a statement is true or false
        System.out.println( "Is it greater? " + ( 5 > -2 ) );
        // prints text and tells you if a statement is true or false
        System.out.println( "Is it greater or equal? " + ( 5 >= -2 ) );
        // prints text and tells you if a statement is true or false
        System.out.println( "Is it less or equal? " + ( 5 <= -2 ) );
    }
}
