package Do_WhileLoops;

import java.util.Scanner;

public class RightTriangleChecker {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int x, y, z;

        System.out.print("Enter three integers:\nSide 1: ");
        x = keyboard.nextInt();
        System.out.print("Side 2: ");
        y = keyboard.nextInt();

        while (y < x) {
            System.out.print(y + " is smaller than " + x + ". Try again: ");
            y = keyboard.nextInt();
        }
        System.out.print("Side 3: ");
        z = keyboard.nextInt();

        while (z < y) {
            System.out.print(z + " is smaller than " + y + ". Try again: ");
            z = keyboard.nextInt();
        }
        System.out.println("Your three sides are " + x + " " + y + " " + z);

        int xsquare = x * x;
        int ysquare = y * y;
        int xysquare = xsquare + ysquare;
        int zsquare = z * z;


        if (xysquare == zsquare) {
            System.out.println("These sides *do* make a right triangle.  Yippy-skippy!");
        }
        else {
            System.out.println("NO!  These sides do not make a right triangle!");
        }
    }
}
