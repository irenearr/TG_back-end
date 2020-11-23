package IfStatements;

import java.util.Scanner;

public class TwoMoreQuestions {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String answer1, answer2;

        System.out.println("TWO MORE QUESTIONS, BABY!\n" +
                "\n" +
                "Think of something and I'll try to guess it!\n" +
                "\n" +
                "Question 1) Does it stay inside or outside or both?");

        answer1 = keyboard.next();

        System.out.println("Question 2) Is it a living thing?");

        answer2 = keyboard.next();

        if (answer1.equals("inside") && answer2.equals("yes")) {
            System.out.println("Then you must be thinking of a cute little pet kitten!");
        }
        if (answer1.equals("outside") && answer2.equals("yes")) {
            System.out.println("Then what else could you be thinking of besides a python?!?");
        }
        if (answer1.equals("both") && answer2.equals("yes")) {
            System.out.println("I'm guessing you're thinking of a spider!");
        }
        if (answer1.equals("inside") && answer2.equals("no")) {
            System.out.println("Clearly you're thinking of a nice comfy sofa.");
        }
        if (answer1.equals("outside") && answer2.equals("no")) {
            System.out.println("It has to be a piece of chewing gum stuck to the pavement!");
        }
        if (answer1.equals("both") && answer2.equals("no")) {
            System.out.println("Obviously the nonliving, inside/outside thing on your mind is a dead ant!");
        }
    }}