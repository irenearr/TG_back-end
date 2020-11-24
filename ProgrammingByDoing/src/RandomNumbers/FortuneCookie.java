package RandomNumbers;

import java.util.Random;

public class FortuneCookie {
    public static void main(String[] args) {
        Random r = new Random();

        int choice = 1 + r.nextInt(6);
        String fortune = "";

        if ( choice == 1 )
            fortune = "\"You will find happiness with a new love.\"";
        else if ( choice == 2 )
            fortune = "\"Today it's up to you to create the peacefulness you long for.\"";
        else if ( choice == 3 )
            fortune = "\"A friend asks only for your time not your money.\"";
        else if ( choice == 4 )
            fortune = "\"A smile is your passport into the hearts of others.\"";
        else if ( choice == 5 )
            fortune = "\"A good way to keep healthy is to eat more Chinese food.\"";
        else if ( choice == 6 )
            fortune = "\"Land is always on the mind of a flying bird.\"";

        System.out.println( "Fortune cookie says: " + fortune );
    }
}
