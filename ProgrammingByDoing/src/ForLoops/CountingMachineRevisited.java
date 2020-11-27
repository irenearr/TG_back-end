package ForLoops;

import java.util.Scanner;

public class CountingMachineRevisited {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int a, b, c;

        System.out.print("Count from: ");
        a = keyboard.nextInt();
        System.out.print("Count to  : ");
        b = keyboard.nextInt();
        System.out.print("Count by  : ");
        c = keyboard.nextInt();

        for (int n = a ; n <= b ; n = n+c) {
            System.out.println(n + "   ");
        }
    }
}
