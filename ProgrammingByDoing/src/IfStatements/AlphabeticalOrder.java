package IfStatements;

import java.util.Scanner;

public class AlphabeticalOrder {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String lastname;
        int groupAC, groupCJ, groupJS, groupSY;

        System.out.println("What's your last name? ");
        lastname = keyboard.next();

        groupAC = lastname.compareTo("Carswell");
        groupCJ = lastname.compareTo("Jones");
        groupJS = lastname.compareTo("Smith");
        groupSY = lastname.compareTo("Young");

        if (groupAC < 0) {
            System.out.println("you don't have to wait long");
        }
        else if (groupCJ < 0) {
            System.out.println("that's not bad");
        }
        else if (groupJS < 0) {
            System.out.println("looks like a bit of a wait");
        }
        else if (groupSY < 0) {
            System.out.println("it's gonna be a while");
        }
        else {
            System.out.println("not going anywhere for a while?");
        }
    }
}
//        name is "Carswell" or before: say "you don't have to wait long"
//        name is "Jones" or before: say "that's not bad"
//        name is "Smith" or before: say "looks like a bit of a wait"
//        name is "Young" or before: say "it's gonna be a while"
//        name is after "Young": say "not going anywhere for a while?"