package IfStatements;
import java.util.Scanner;

public class HowOldAreYou3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String name;
        int age;

        System.out.print("Hey, what's your name? ");
        name = keyboard.next();
        System.out.print("Ok " + name + ", how old are you? ");
        age = keyboard.nextInt();

        if (age < 16)
        {
            System.out.println("You can't drive " + name + ".");
        }
        if (age > 16 && age < 18) {
            System.out.println("You can drive but not vote " + name + ".");
        }
        if (age > 18 && age < 24) {
            System.out.println("You can vote but not rent a car " + name + ".");
        }
        if (age > 24) {
            System.out.println("You can do pretty much anything " + name + ".");
        }
    }
}
