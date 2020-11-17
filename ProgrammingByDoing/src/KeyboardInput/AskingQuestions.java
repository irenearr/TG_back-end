package KeyboardInput;
import java.util.Scanner;

public class AskingQuestions
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);

        int age, height_m, height_cm;
        double weight;

        System.out.print( "How old are you? " );
        age = keyboard.nextInt();

        System.out.print( "How tall are you (meters)? " );
        height_m = keyboard.nextInt();

        System.out.print( "How tall are you (centimeters)? " );
        height_cm = keyboard.nextInt();

        System.out.print( "How much do you weigh? " );
        weight = keyboard.nextDouble();

        System.out.println( "So you're " + age + " years old, " + height_m + " m and " + height_cm + " cm tall and " + weight + " kg." );
    }
}