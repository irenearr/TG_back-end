package IfStatements;

import java.util.Scanner;

public class ChooseYourOwnAdventure {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String answer1, answer2, answer3;

        System.out.println("WELCOME TO MITCHELL'S TINY ADVENTURE!\n" +
                "\n" +
                "You are in a creepy house!  Would you like to go \"upstairs\" or into the\n" +
                "\"kitchen\"?");
        answer1 = keyboard.next();
        if (answer1.equals("upstairs")) {
            System.out.println("Upstairs you see a hallway.  At the end of the hallway is the master\n" +
                    "\"bedroom\".  There is also a \"bathroom\" off the hallway.  Where would you like\n" +
                    "to go?");
            answer2 = keyboard.next();
            if (answer2.equals("bedroom")) {
                System.out.println("You are in a plush bedroom, with expensive-looking hardwood furniture.  The\n" +
                        "bed is unmade.  In the back of the room, the closet door is ajar.  Would you\n" +
                        "like to open the door? (\"yes\" or \"no\")");
                answer3 = keyboard.next();
                if (answer3.equals("yes")) {
                    System.out.println("There's a monster in the closet! But it's a nice monster, so it gives you some candy and shows you the way to the arcade. You won!!");
                }
                else if (answer3.equals("no")) {
                    System.out.println("Well, then I guess you'll never know what was in there.  Thanks for playing,\n" +
                            "I'm tired of making nested if statements.");
                }
            }
            else if (answer2.equals("bathroom")) {
            System.out.println("You are in the bathroom. Do you need to pee? (\"yes\" or \"no\")");
                answer3 = keyboard.next();
                if (answer3.equals("yes")) {
                    System.out.println("Then you're in the right place! I'll leave you to it, good luck.");
                }
                else if (answer3.equals("no")) {
                    System.out.println("What are you doing in a bathroom then for God's sake??");
                }
            }
        }
        else if (answer1.equals("kitchen")) {
            System.out.println("There is a long countertop with dirty dishes everywhere.  Off to one side\n" +
                    "there is, as you'd expect, a refrigerator. You may open the \"refrigerator\"\n" +
                    "or look in a \"cabinet\".");
            answer2 = keyboard.next();
            if (answer2.equals("refrigerator")) {
                System.out.println("Inside the refrigerator you see food and stuff.  It looks pretty nasty.\n" +
                        "Would you like to eat some of the food? (\"yes\" or \"no\")");
                answer3 = keyboard.next();
                if (answer3.equals("yes")) {
                    System.out.println("You die of food poisoning... quickly.");
                } else if (answer3.equals("no")) {
                    System.out.println("You die of starvation... eventually.");
                }} else if (answer2.equals("cabinet")) {
                    System.out.println("In the cabinet is a mouse! Are you afraid of mice? (\"yes\" or \"no\")");
                    answer3 = keyboard.next();
                    if (answer3.equals("yes")) {
                        System.out.println("You die of a heart attack... Game over!");
                    } else if (answer3.equals("no")) {
                        System.out.println("You and the mouse become best friends and live happily ever after!!");
                    }
                }
            }
        }}