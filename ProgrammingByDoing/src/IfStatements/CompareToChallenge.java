//compareTo() Challenge
//        Write a program that compares several Strings using the compareTo() method.
//        You should display the Strings and display the integer that compareTo() gives you.
//
//        You must have five examples which result in a number less than 0, five examples which result
//        in a number greater than 0, and two examples which give you exactly 0. This means you need a
//        total of twelve examples.
//
//        You may not just flip the Strings around; you must have twelve different examples.

package IfStatements;

public class CompareToChallenge {
    public static void main(String[] args) {

        System.out.print("Comparing \"axe\" with \"dog\" produces ");
        int i = "axe".compareTo("dog");
        System.out.println(i);

        System.out.print("Comparing \"pear\" with \"teddybear\" produces ");
        System.out.println( "pear".compareTo("teddybear") );

        System.out.print("Comparing \"bill\" with \"dog\" produces ");
        System.out.println( "bill".compareTo("dog") );

        System.out.print("Comparing \"car\" with \"hand\" produces ");
        System.out.println( "car".compareTo("hand") );

        System.out.print("Comparing \"tip\" with \"top\" produces ");
        System.out.println( "tip".compareTo("top") );

        System.out.print("Comparing \"top\" with \"top\" produces ");
        System.out.println( "top".compareTo("top") );

        System.out.print("Comparing \"battery\" with \"battery\" produces ");
        System.out.println( "battery".compareTo("battery") );

        System.out.print("Comparing \"weapon\" with \"cat\" produces ");
        System.out.println( "weapon".compareTo("cat") );

        System.out.print("Comparing \"applebee's\" with \"apple\" produces ");
        System.out.println( "applebee's".compareTo("apple") );

        System.out.print("Comparing \"tomato\" with \"potato\" produces ");
        System.out.println( "tomato".compareTo("potato") );

        System.out.print("Comparing \"pear\" with \"bear\" produces ");
        System.out.println( "pear".compareTo("bear") );

        System.out.print("Comparing \"plant\" with \"bunny\" produces ");
        System.out.println( "plant".compareTo("bunny") );




    }
}
