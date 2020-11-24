package WhileLoops;

import java.util.Random;

public class DiceDoubles {
    public static void main(String[] args) {
        Random r = new Random();

        int dice1 = 1 + r.nextInt(6);
        int dice2 = 1 + r.nextInt(6);

        System.out.println("HERE COME THE DICE!\n" +
                "\n" +
                "Roll #1: " + dice1 + "\n" +
                "Roll #2: " + dice2 + "\n" +
                "The total is " + (dice1 + dice2) + "!");

        while (dice1 != dice2) {
            dice1 = 1 + r.nextInt(6);
            dice2 = 1 + r.nextInt(6);
        }

        System.out.println(
                "Roll #1: " + dice1 + "\n" +
                "Roll #2: " + dice2 + "\n" +
                "The total is " + (dice1 + dice2) + "!");
    }
}
