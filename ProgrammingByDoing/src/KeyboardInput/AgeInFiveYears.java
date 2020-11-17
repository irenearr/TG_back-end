package KeyboardInput;
import java.util.Scanner;

public class AgeInFiveYears {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String name;
        int age, agein5, agemin5;

        System.out.print("Hello.  What is your name? ");
        name = keyboard.next();

        System.out.print("\nHi, " + name + "! How old are you? ");
        age = keyboard.nextInt();

        agein5 = age + 5;
        agemin5 = age - 5;

        System.out.print("\nDid you know that in five years you will be " + agein5 + " years old?\n" +
                "And five years ago you were " + agemin5 + "! Imagine that!");
    }
}
