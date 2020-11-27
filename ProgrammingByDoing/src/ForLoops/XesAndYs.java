package ForLoops;

public class XesAndYs {
    public static void main(String[] args) {
        double x = -10, y = 0;

        System.out.println("x      y\n____________");
        for (x = -10 ; x <= 10 ; x = x + 0.5)
        {
            y = x*x;
            System.out.println(x + "  " + y);
        }
    }
}
