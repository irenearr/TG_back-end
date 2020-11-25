package IfStatements;

import java.util.Scanner;

public class TwentyQuestions {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String answer1, answer2;

        System.out.println("TWO QUESTIONS!\n" +
                "Think of an object, and I'll try to guess it.\n" +
                "\n" +
                "Question 1) Is it animal, vegetable, or mineral?");
        answer1 = keyboard.next();

        System.out.println("Question 2) Is it bigger than a breadbox? (please answer yes/no)");
        answer2 = keyboard.next();

//boolean isYes = answer2.equals("yes");

        if (answer1.equals("animal")) {
//            if (!isYes) {
            if(answer2.equals("no")) {
            System.out.println("You're thinking of a squirrel!\n" +
                    "I would ask you if I'm right, but I don't actually care.");
        }
            else if (answer2.equals("yes")) {
                System.out.println("You're thinking of a moose!\n" +
                        "I would ask you if I'm right, but I don't actually care.");
        }} else if (answer1.equals("vegetable")) {
            if(answer2.equals("no")){
            System.out.println("You're thinking of a carrot!\n" +
                    "I would ask you if I'm right, but I don't actually care.");
        }
           else if(answer2.equals("yes")) {
                System.out.println("You're thinking of a watermelon!\n" +
                        "I would ask you if I'm right, but I don't actually care.");
        }} else if (answer1.equals("mineral")) { if(answer2.equals("no")) {
            System.out.println("You're thinking of a paper clip!\n" +
                    "I would ask you if I'm right, but I don't actually care.");
        } if (answer2.equals("yes")) {
            System.out.println("You're thinking of a truck!\n" +
                    "I would ask you if I'm right, but I don't actually care.");
        }}
        else {
            System.out.println("Sorry, I didn't catch that. Please answer yes or no");
        }
    }
}
