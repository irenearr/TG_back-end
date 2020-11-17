/*
  If you get stuck with an exercise, remember the tricks you've been taught so far for finding differences
  and focusing on details:
        Write a comment above each line explaining to yourself what it does in English.
        Read your .java file backwards.
        Read your .java file out loud, saying even the punctuation and symbols.

I used 4.0 for space_in_a_car, but is that necessary? What happens if it's just 4?
    Answer: nothing, because space_in_a_car is already defined as a variable of the type double.
Remember that 4.0 is a "floating point" number. Find out what that means.
    It's a decimal number
Write comments above each of the variable assignments.
Make sure you know what = is called (equals) and that it's making names for things.
Remember _ is an underscore character.

What is the difference between = (single-equal) and == (double-equal)?
    The = (single-equal) assigns the value on the right to a variable on the left.
    The == (double-equal) tests if two things have the same value.
    You'll learn more about comparing things in a later assignment.
*/

package Variables;

public class VariablesAndNames {
    public static void main( String[] args )
    {
        int cars, drivers, passengers, cars_not_driven, cars_driven;
        double space_in_a_car, carpool_capacity, average_passengers_per_car;

        // number of cars is an integer
        cars = 100;
        // space_in_a_car is a double, but could just as well be an integer
        space_in_a_car = 4;
        // drivers is an integer
        drivers = 30;
        // passengers is an integer
        passengers = 90;
        // cars_not_driven is an integer, just like cars and drivers
        cars_not_driven = cars - drivers;
        // cars_driven is an integer, just like drivers
        cars_driven = drivers;
        // carpool_capacity is a double, just like space_in_a_car is a double
        carpool_capacity = cars_driven * space_in_a_car;
        // average... is a double, often a division creates a decimal number, therefore a double type variable
        average_passengers_per_car = passengers / cars_driven;

        System.out.println( "There are " + cars + " cars available." );
        System.out.println( "There are only " + drivers + " drivers available." );
        System.out.println( "There will be " + cars_not_driven + " empty cars today." );
        System.out.println( "We can transport " + carpool_capacity + " people today." );
        System.out.println( "We have " + passengers + " to carpool today." );
        System.out.println( "We need to put about " + average_passengers_per_car + " in each car." );
    }
}